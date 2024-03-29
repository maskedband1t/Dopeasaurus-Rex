package org.usfirst.frc.team2383.robot.ninjaLib;

import edu.wpi.first.wpilibj.command.Command;

public class  Delay extends Command {

    public Delay(double seconds) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        
        setTimeout(seconds);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("Starting delay...\n");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        System.out.println("Done delaying.\n\n");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}