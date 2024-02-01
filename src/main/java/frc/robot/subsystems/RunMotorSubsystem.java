// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RunMotorSubsystem extends SubsystemBase {
  /** Creates a new LauncherSubsystem. */
public CANSparkMax m_motor;

  public RunMotorSubsystem() {
    this.m_motor  = new CANSparkMax(1, MotorType.kBrushless); //set deviceId to MotorController(CS##)
  }

  public void runMotor(double speed) {
     m_motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
