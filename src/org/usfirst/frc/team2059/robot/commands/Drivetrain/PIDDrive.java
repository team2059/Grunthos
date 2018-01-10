package org.usfirst.frc.team2059.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj.command.PIDCommand;

import org.usfirst.frc.team2059.robot.RobotMap;
import org.usfirst.frc.team2059.robot.commands.CommandBase;


public class PIDDrive extends PIDCommand {

	public PIDDrive() {
		super(RobotMap.Pconstant, RobotMap.Iconstant, RobotMap.Dconstant);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void usePIDOutput(double speed) {
		// TODO Auto-generated method stub
		CommandBase.driveBase.driveForward(speed);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
