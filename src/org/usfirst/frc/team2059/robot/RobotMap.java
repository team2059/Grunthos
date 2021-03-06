/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2059.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static String gameData = "LLL";
	
	public static boolean pidElevatorValue = false;
	
	//Drivetrain
	public static int LeftMotor1 = 0;
	public static int LeftMotor2 = 1;
	public static int RightMotor1 = 2;
	public static int RightMotor2 = 3;
	
	public static int leftEncoder1 = 0;
	public static int leftEncoder2 = 1;
	public static int rightEncoder1 = 2;
	public static int rightEncoder2 = 3;
		
	public static double correction = .1;
	public static double deadzone = 0;
	
	public static double pDriveTurn = 0.031;
	public static double iDriveTurn = 0.0;
	public static double dDriveTurn = 0.055;

	public static double pDriveStraight = 0.033;
	public static double iDriveStraight = 0.0;
	public static double dDriveStraight = 0.15;

	public static double straightLineP = 0.018;
	public static double straightLineI = 0;
	public static double straightLineD = 0.0054;
	
	//Collector
	public static int collectorMotor1 = 4;
	public static int collectorMotor2 = 5;
	
	
	//Elevator
	public static int elevatorMotor1 = 11;
	public static int elevatorMotor2 = 10;
	
	public static int hallEffect1 = 4;
	public static int hallEffect2 = 5;
	
	public static int elevatorEncoder1 = 4;
	public static int elevatorEncoder2 = 5;
	
	public static double ElevatorP = .2;
	public static double ElevatorI = 0;
	public static double ElevatorD = 0;
	
	public static int SwitchHeight = 35;
	public static int ScaleHeight = 60;
	
	//Ramps
	public static int rampMotor = 8;
	
	//Climber
	public static int climberMotor1 = 7;
	public static int climberMotor2 = 8;
	
	//Vision
	public static int camera1 = 0;
	public static int camera2 = 1;
	
	//Pneumatics
	public static int compressor = 42;
	public static int spike = 0;
	
	public static int LeftRamp1 = 0;
	public static int LeftRamp2 = 1;
	public static int LeftRamp3 = 2;
	public static int LeftRamp4 = 3;

	public static int RightRamp1 = 4;
	public static int RightRamp2 = 5;
	public static int RightRamp3 = 6;
	public static int RightRamp4 = 7;

	public enum Auto {
		DONOTHING,
		DRIVESTRAIGHT,
		LEFT,
		CENTER,
		RIGHT,
		LEFTSCALE,
		RIGHTSCALE,
		LEFTSWITCH
	}
}


 
