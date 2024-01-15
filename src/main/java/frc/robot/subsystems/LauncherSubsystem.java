// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherSubsystem extends SubsystemBase {
  /** Creates a new LauncherSubsystem. */
  public Talon launcherMotor;
  public Talon feedMotor = new Talon(43);

  public LauncherSubsystem() {
    this.launcherMotor  = new Talon(41);
    this.feedMotor = new Talon(43);
  }

    public void launch(double speed) {
      this.launcherMotor.set(speed);
    }

    public void feed(double speed) {
      this.feedMotor.set(speed);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
