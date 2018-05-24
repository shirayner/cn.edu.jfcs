package cn.edu.jfcs.sys;

import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.StatusLineLayoutData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class StatusBarContribution extends ContributionItem {

	private String message;

	@Override
	public void fill(Composite parent) {
		//添加一个竖立的分割线
		Label separator = new Label(parent, SWT.SEPARATOR);
		//布局数据类
		StatusLineLayoutData statusLineLayoutData = new StatusLineLayoutData();
		statusLineLayoutData.heightHint = 20;
		separator.setLayoutData(statusLineLayoutData);
		
		//显示文字信息的标签
		CLabel statusCLabel = new CLabel(parent, SWT.SHADOW_NONE);
		statusLineLayoutData = new StatusLineLayoutData();
		statusLineLayoutData.widthHint = 315;
		statusCLabel.setLayoutData(statusLineLayoutData);
		statusCLabel.setText(message);
		statusCLabel.setImage(CacheImage.getINSTANCE().getImage(
				IAppConstants.APPLICATION_ID, IImageKey.LOG_USER_INFO));
	}

	public StatusBarContribution() {
		super();
	}

	public StatusBarContribution(String msg) {
		message = msg;
	}
}
