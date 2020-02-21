package frc.Autos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.commands.DriveDistance;
import frc.commands.ShootWithSensors;
import frc.commands.TurnToAngle;
import frc.robot.Robot;

/**
 *
 * Shoots and picks up from the control panel and then shoots again
 *
 */
public class ShootNControlPickUp extends SequentialCommandGroup {

    public ShootNControlPickUp(){
        addRequirements(Robot.drivetrain, Robot.shooter);
        addCommands(new ShootWithSensors(ShootWithSensors.ShootType.Speed, 2000, 0),
                new TurnToAngle(0,false),
                new DriveDistance(-191.2),
                new ShootWithSensors(ShootWithSensors.ShootType.Speed, 2000, 0));
    }
}
