package frc.robot;

/**
 * define Hardware Ports in here
 */
public class RobotMap {
    //General
    public static final int PCM_CAN = 13;

    public static final int SHOOTER_TOP = 8;
    public static int SHOOTER_BOTTOM = 6;

    public static final int RIGHT_DRIVE_LEADER = 3;
    public static final int RIGHT_DRIVE_FOLLOWER = 4;
    public static final int LEFT_DRIVE_LEADER = 1;
    public static final int LEFT_DRIVE_FOLLOWER = 2;
    //Intake
    public static final int INTAKE_MOTOR = 11;
    public static final int INTAKE_FORWARD_SOLENOID = 2;
    public static final int INTAKE_REVERSE_SOLENOID = 5;
    //Conveyor
    public static final int CONVEYOR_MOTOR_BACK = 9;
    public static final int CONVEYOR_MOTOR_FRONT = 12;
    public static final int INDEX_MOTOR = 10;
    //Sensors
    public static final int DIO_INTAKE_BEAM_BREAK = 0;
    public static final int DIO_PRE_INDEX_BEAM_BREAK = 9;
    public static final int DIO_SECOND_BALL_INDEX = 2;
    // Climber
    public static int CLIMBER_LEFT_MOTOR = 5;
    public static int CLIMBER_RIGHT_MOTOR = 7;
    public static int CLIMBER_FORWARD_SOLENOID = 3;
    public static int CLIMBER_REVERSE_SOLENOID = 4;


}