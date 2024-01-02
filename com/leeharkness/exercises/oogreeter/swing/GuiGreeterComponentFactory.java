package com.leeharkness.exercises.oogreeter.swing;

import javax.swing.*;
import java.awt.*;

import com.leeharkness.exercises.oogreeter.greeterfactory.AppendingMessageBuildingComponent;
import com.leeharkness.exercises.oogreeter.greeterfactory.GreeterComponentFactory;
import com.leeharkness.exercises.oogreeter.greeterfactory.InputComponent;
import com.leeharkness.exercises.oogreeter.greeterfactory.MessageBuildingComponent;
import com.leeharkness.exercises.oogreeter.greeterfactory.OutputComponent;

public class GuiGreeterComponentFactory implements GreeterComponentFactory {
	
	JFrame myFrame;
	JLabel lblText;
	
	
	public GuiGreeterComponentFactory() {
		myFrame = new JFrame("GUI Greeter");
		myFrame.setMinimumSize(new Dimension(800, 600));
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblText = new JLabel("GUI Greeter", SwingConstants.CENTER);
        myFrame.getContentPane().add(lblText);
	}

	@Override
	public InputComponent getInputComponent() {
		return new GuiInputComponent(myFrame);
	}

	@Override
	public MessageBuildingComponent getMessageBuildingComponent() {
		return new AppendingMessageBuildingComponent();
	}

	@Override
	public OutputComponent getOutputComponent() {
		return new GuiOutputComponent(lblText);
	}

}
