package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class CommandBase extends Command {

    public CommandBase() {

        super();
    }

    public static void updateDashboard() {

        SmartDashboard.putString("Data Test", "");
    }
}
