package cn.edu.jfcs.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchWindow;


public class UserManag extends Action {
	private final IWorkbenchWindow window;
	
	public UserManag(IWorkbenchWindow window){
		this.window=window;
		setId("cn.edu.jfcs.actions.userManag");
		setText("用户管理@ALT+U");
		//setEnabled(SaveLogInfo.getInstance().getUsertag().equals("2")?true:false);
	}

	public void run() {
		
	}
}
