package cn.edu.jfcs.app;



import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import cn.edu.jfcs.sys.CacheImage;
import cn.edu.jfcs.sys.HookSysTray;
import cn.edu.jfcs.sys.IAppConstants;
import cn.edu.jfcs.sys.IImageKey;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	private HookSysTray hookSysTray;

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		//1.窗口设定为 800x600
		configurer.setInitialSize(new Point(800, 600));

		//2.显示工具栏
		configurer.setShowCoolBar(true);

		//3.显示状态栏
		configurer.setShowStatusLine(true);

		//4.窗口只显示最小化、关闭按钮
		configurer.setShellStyle(SWT.MIN | SWT.CLOSE);

		//5.设置窗口标题
		configurer.setTitle(IAppConstants.APPLICATION_TITLE);

	}

	private void createSystemTray() {
		hookSysTray = new HookSysTray();
		hookSysTray.createSysTray(getWindowConfigurer().getWindow());
	}

	@Override
	public void postWindowOpen() {
		//1.设置窗口自动居中
		Shell shell=getWindowConfigurer().getWindow().getShell();
		Rectangle screenSize=Display.getDefault().getClientArea();
		Rectangle frameSize=shell.getBounds();

		int x=(screenSize.width-frameSize.width)/2;
		int y=(screenSize.height-frameSize.height)/2;
		shell.setLocation(x, y);

		//2.创建系统托盘
		createSystemTray();

		//3.设置状态栏临时信息
		IStatusLineManager statusline = getWindowConfigurer().getActionBarConfigurer().getStatusLineManager();
		statusline.setMessage(CacheImage.getINSTANCE().getImage(
				IAppConstants.APPLICATION_ID, IImageKey.AUTHOR),
				"Powered by ray");

	}





}
