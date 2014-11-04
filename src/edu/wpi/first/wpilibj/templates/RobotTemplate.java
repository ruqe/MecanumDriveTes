/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    Joystick rightstick, leftstick;
    RobotDrive drivetrain;
    public void robotInit(){
        leftstick = new Joystick(1);
        rightstick = new Joystick(2);
        drivetrain = new RobotDrive(1,2,3,4);
        
    }
    
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        while(isEnabled() && isOperatorControl()){
            drivetrain.mecanumDrive_Polar(leftstick.getY(), leftstick.getX(), rightstick.getX());
            System.out.println("Y: " + leftstick.getY() + " X: " + leftstick.getX() + " T: " + rightstick.getX());
        }

    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
