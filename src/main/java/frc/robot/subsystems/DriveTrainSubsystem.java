// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
  public Spark frontleft;
  public Spark frontright;
  public Spark backleft;
  public Spark backright;

 
  /** Creates a new DriveTrainSubsystem. */
  public DriveTrainSubsystem() {
    this.frontleft = new Spark(0);
    this.frontright = new Spark(1);
    this.backleft = new Spark(2);
    this.backright = new Spark(3);

    
  }

  public void drive(double leftSpeed, double rightSpeed) {
    this.frontleft.set(leftSpeed);
    this.frontright.set(rightSpeed);
    this.backleft.set(leftSpeed);
    this.backright.set(rightSpeed);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
