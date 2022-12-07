package org.firstinspires.ftc.teamcode.Auto;//change to Autonomous folder path
//package org.firstinspires.ftc.teamcode.Auto;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Projects.ProjectPushBot;

//name that appears on the driver hub screen
@Autonomous(name = "TestAuto")
public class TestAuto extends LinearOpMode {
    //making a robot from project file (hardware map)
    public ProjectPushBot robot = new ProjectPushBot();

    @Override
    public void runOpMode() throws InterruptedException {
        //initialize hardware map
        robot.init(hardwareMap);

        waitForStart();
        //autonomous happens here

    }
}
