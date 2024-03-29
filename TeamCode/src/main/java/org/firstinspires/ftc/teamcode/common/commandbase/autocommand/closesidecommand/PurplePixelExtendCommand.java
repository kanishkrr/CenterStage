package org.firstinspires.ftc.teamcode.common.commandbase.autocommand.closesidecommand;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;

import org.firstinspires.ftc.teamcode.common.commandbase.subsystemcommand.ArmCommand;
import org.firstinspires.ftc.teamcode.common.commandbase.subsystemcommand.PivotCommand;
import org.firstinspires.ftc.teamcode.common.subsystems.IntakeSubsystem;

public class PurplePixelExtendCommand extends SequentialCommandGroup {

    public PurplePixelExtendCommand() {
        super(
                new ArmCommand(1000),
                new PivotCommand(IntakeSubsystem.Mode.LINED),
                new WaitCommand(1000),
                new ArmCommand(1300),
                new WaitCommand(600),
                new ArmCommand(1425),
                new WaitCommand(500)
        );
    }
}
