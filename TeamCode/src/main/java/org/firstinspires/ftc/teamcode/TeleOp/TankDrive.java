package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.Projects.ProjectPushBot;

//import actual project name


@TeleOp(name = "TankDrive")
public class TankDrive extends LinearOpMode {
    private ProjectPushBot robot = new ProjectPushBot();
    @Override
    public void runOpMode() throws InterruptedException {
        //connects configuration to code
        robot.init(hardwareMap);
        waitForStart();

        while(opModeIsActive()) {
            //driving controls
            robot.backleft.setPower(-gamepad1.left_stick_y);
            robot.backright.setPower(-gamepad1.right_stick_y);
            if(gamepad1.a){
                robot.intake.setPower(1);
            }
            else if (gamepad1.x){
                robot.intake.setPower(-1);

            }
            else{
                robot.intake.setPower(0);
            }
        }
        robot.backleft.setPower(0);
        robot.backright.setPower(0);
        robot.intake.setPower(0);

    }
}