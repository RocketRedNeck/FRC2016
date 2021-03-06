package org.usfirst.frc.team4183.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SwarmyMoveToPos extends CommandGroup {
    
	public int pos;
	
    public  SwarmyMoveToPos(int pos) {
    	this.pos = pos;
        // Add Commands here:
    	addSequential(new PrepUnlatch());
        addSequential(new SwarmySetPos(pos-5000));
        addSequential(new SwarmyLatch());
        addSequential(new SwarmyDelay(300));
        addSequential(new ExceedSetpoint(pos));
        //
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
