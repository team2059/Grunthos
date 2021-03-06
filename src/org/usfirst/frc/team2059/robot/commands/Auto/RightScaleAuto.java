package org.usfirst.frc.team2059.robot.commands.Auto;

import org.usfirst.frc.team2059.robot.AutoPaths;
import org.usfirst.frc.team2059.robot.RobotMap;
import org.usfirst.frc.team2059.robot.commands.Intake;
import org.usfirst.frc.team2059.robot.commands.PIDElevate;
import org.usfirst.frc.team2059.robot.commands.Drivetrain.PIDDrive;
import org.usfirst.frc.team2059.robot.commands.Drivetrain.PIDTurn;
import org.usfirst.frc.team2059.robot.commands.Drivetrain.PathDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightScaleAuto extends CommandGroup{

	public RightScaleAuto() {
		
		//addSequential(new PIDElevate(RobotMap.ScaleHeight), 3);
		
		if (RobotMap.gameData.charAt(1) == 'R') {
			
			//addSequential(new PIDDrive(298), 4);
			addSequential(new PathDrive(AutoPaths.RightToRightScale, AutoPaths.configSlow), 7);

			addSequential(new Intake(1,1), 1);
			addSequential(new PIDDrive(-20), 1);
			addSequential(new PIDElevate(0));
			
		} else if (RobotMap.gameData.charAt(0) == 'L') {
			
			//addSequential(new PIDDrive(215), 3);
			//addSequential(new PIDTurn(-90), 2);
			//addSequential(new PIDDrive(190), 3);
			//addSequential(new PIDTurn(0), 2);
			//addSequential(new PIDDrive(83), 2);
			
			addSequential(new PathDrive(AutoPaths.RightToLeftScale, AutoPaths.configSlow));
			
			addSequential(new Intake(1,1), 1);
			addSequential(new PIDDrive(-20), 1);
			addSequential(new PIDElevate(0));
		}
		
	}
	
}
