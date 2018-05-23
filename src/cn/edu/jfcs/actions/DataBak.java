package cn.edu.jfcs.actions;


import org.eclipse.jface.action.Action;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import cn.edu.jfcs.sys.IAppConstants;
import cn.edu.jfcs.sys.IImageKey;

public class DataBak extends Action {
	boolean isSucess = false;

	public DataBak() {
		setId("cn.edu.jfcs.actions.dataBak");
		setText("数据备份@ALT+D");
		setToolTipText("数据备份");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				IAppConstants.APPLICATION_ID, IImageKey.DATA_BAK));

	}

	public void run() {

	}
}
