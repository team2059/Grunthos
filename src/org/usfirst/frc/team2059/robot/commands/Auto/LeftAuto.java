package org.usfirst.frc.team2059.robot.commands.Auto;

import org.usfirst.frc.team2059.robot.RobotMap;
import org.usfirst.frc.team2059.robot.commands.Intake;
import org.usfirst.frc.team2059.robot.commands.PIDElevate;
import org.usfirst.frc.team2059.robot.commands.Drivetrain.PIDDrive;
import org.usfirst.frc.team2059.robot.commands.Drivetrain.PIDTurn;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftAuto extends CommandGroup{
	
	public LeftAuto() {
		
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		
		if(!gameData.equals("") && gameData.charAt(0) == 'L' )
		{
			//Put switch auto code here
			addParallel(new PIDElevate(RobotMap.SwitchHeight));
			addSequential(new PIDDrive(60));
			addSequential(new PIDTurn(90));
			//addSequential(new Intake(-1), 1000);
			
		} else if (!gameData.equals("") && gameData.charAt(1) == 'L') {
			//Put scale auto code here
			addParallel(new PIDElevate(RobotMap.ScaleHeight));
			addSequential(new PIDDrive(96));
			addSequential(new PIDTurn(90));
			//addSequential(new Intake(-1), 1000);
			
		} else {
			addSequential(new PIDDrive(60));
		}
	}
}
