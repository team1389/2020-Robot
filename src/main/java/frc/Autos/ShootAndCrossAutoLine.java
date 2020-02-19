package frc.Autos;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.*;
import frc.commands.ShootWithSensors;
import frc.robot.Robot;

/***
 * Shoots and then gets off the auto line. Works from any position
 */
public class ShootAndCrossAutoLine extends SequentialCommandGroup {

    public ShootAndCrossAutoLine(){
        addRequirements(Robot.drivetrain, Robot.shooter);
        addCommands(new ShootWithSensors(2000), new InstantCommand(() -> Robot.drivetrain.set(1,1)), new WaitCommand(0.5), new InstantCommand(() -> Robot.drivetrain.set(0,0)));
    }
}