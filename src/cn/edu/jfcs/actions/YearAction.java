/*
 *编写者：陈冈
 *高校经费测算系统--年份导航
 *编写时间：2006-11-19
 */
package cn.edu.jfcs.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;


public class YearAction extends Action {

	private int actionType;

	public YearAction(String text, int actionType, ImageDescriptor image) {
		this.actionType = actionType;
		setToolTipText(text);
		setImageDescriptor(image);
	}

	public void run() {
		
	}
}
