package cn.edu.jfcs.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import cn.edu.jfcs.sys.IAppConstants;
import cn.edu.jfcs.sys.IImageKey;

public class GetServerData extends Action {
	private boolean isSucess = false;

	public GetServerData() {
		setId("cn.edu.jfcs.actions.getServerData");
		setText("获取数据@ALT+S");
		setToolTipText("获取服务器数据");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				IAppConstants.APPLICATION_ID, IImageKey.GET_SERVER_DATA));
		//setEnabled(SaveLogInfo.getInstance().getUsertag().equals("2") ? true: false);
	}

	public void run() {
	}
}
