package cn.edu.jfcs.actions;

import org.eclipse.jface.action.Action;

public class AddNewYear extends Action {
	private boolean isSucess = false;

	public AddNewYear() {
		setId("cn.edu.jfcs.actions.addnewyear");
		setText("新增年度@ALT+N");
		//setEnabled(SaveLogInfo.getInstance().getUsertag().equals("2") ? true: false);
	}

	public void run() {
		
	}
}