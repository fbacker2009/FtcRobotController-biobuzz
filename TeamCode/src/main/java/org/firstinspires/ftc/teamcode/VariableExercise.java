package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariableExercise extends OpMode {
    @Override
    public void init() {
        int teamNumber = 213877;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        boolean touchSensorPressed = false;
        int motorAngle = 147;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("touchSensorPressed", touchSensorPressed);
        telemetry.addData("MotorAngle", motorAngle);
    }

    @Override
    public void loop() {


    }
}