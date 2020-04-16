package com.sabir.training.swt.layout.examples;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class CompositeView extends ViewPart {

	
	public static String VIEW_ID = "com.sabir.training.swt.layout.examples.compositeview";
	public CompositeView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		
		CTabFolder tabFolder = new CTabFolder(parent, SWT.NONE);
		
		createRowComposite(tabFolder);
		createGridComposite(tabFolder);
		
		
	}

	private void createRowComposite(CTabFolder tabFolder) {
		
		
		CTabItem cTabItem = new CTabItem(tabFolder, SWT.None);
		cTabItem.setText("Row Layout");
		Composite rowComposite = new Composite(tabFolder, SWT.BORDER_SOLID);
		rowComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		Button button1 = new Button(rowComposite, SWT.PUSH);
 		button1.setText("Button 1");
  		button1.setLayoutData(new RowData(150, 40));
  		
  		Button button2 = new Button(rowComposite, SWT.PUSH);
  		button2.setText("Button 2");
  		button2.setLayoutData(new RowData(250, 40));
  		
  		
  		Button button3 = new Button(rowComposite, SWT.PUSH);
  		button3.setText("Button 3");
  		button3.setLayoutData(new RowData(350, 40));
  		
  		Button button4 = new Button(rowComposite, SWT.PUSH);
  		button4.setText("Button 4");
  		button4.setLayoutData(new RowData(450, 40));
  		cTabItem.setControl(rowComposite);
  		
  		tabFolder.setSelection(cTabItem);
  		
  		
		
	}
	
	
private void createGridComposite(CTabFolder tabFolder) {
		
		
		CTabItem cTabItem = new CTabItem(tabFolder, SWT.None);
		cTabItem.setText("Grid Layout");
		Composite gridComposite = new Composite(tabFolder, SWT.BORDER_SOLID);
		gridComposite.setLayout(new GridLayout(2, false));
		
		Group group = new Group(gridComposite, SWT.NONE);
		group.setLayout(new GridLayout(3,false));
		group.setText("Input");
		
		Label label = new Label(group, SWT.NONE);
		label.setText("Enter Name:");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		Text text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		
		Button button1 = new Button(gridComposite, SWT.PUSH);
 		button1.setText("Button 1");
  		button1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
  		
  		Button button2 = new Button(gridComposite, SWT.PUSH);
  		button2.setText("Button 2");
  		button2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
  		
  		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
  		
  		Button button3 = new Button(gridComposite, SWT.PUSH);
  		button3.setText("Button 3");
  		button3.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
  		
  		Button button4 = new Button(gridComposite, SWT.PUSH);
  		button4.setText("Button 4");
  		button4.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
  		cTabItem.setControl(gridComposite);
  		
  		
  		
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
