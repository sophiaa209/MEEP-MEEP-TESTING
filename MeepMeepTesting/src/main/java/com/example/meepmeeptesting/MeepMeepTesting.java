package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

import java.util.Vector;


public class MeepMeepTesting {

    //CLASA CUPRINDE TRAJECTORY SEQUENCES PENTRU CELE 4 POZITII PE TEREN, CU TOATE CAZURILE
    //AM FACUT-O SA MA FAMILIARIZEZ CU MEEP MEEP
    //VALORILE FOLOSITE SUNT APROXIMATIVE

    /*
      CAZ STANGA(=)1
      CAZ MIJLOC(=)2
      CAZ DREAPTA(=)3
    */

    public static double START_POSE_RED_CLOSE_X=12;
    public static double START_POSE_RED_CLOSE_Y=-62;
    public static double START_POSE_RED_CLOSE_ANGLE=90;

    public static double START_POSE_RED_FAR_X=-36;
    public static double START_POSE_RED_FAR_Y=-62;
    public static double START_POSE_RED_FAR_ANGLE=90;

    public static double START_POSE_BLUE_CLOSE_X=12;
    public static double START_POSE_BLUE_CLOSE_Y=62;
    public static double START_POSE_BLUE_CLOSE_ANGLE=-90;

    public static double START_POSE_BLUE_FAR_X=-36;
    public static double START_POSE_BLUE_FAR_Y=62;
    public static double START_POSE_BLUE_FAR_ANGLE=-90;

    public static double PLACE_ON_BB_RED_1_X=47;
    public static double PLACE_ON_BB_RED_1_Y=-29.5f;
    public static double PLACE_ON_BB_RED_1_ANGLE=0;

    public static double PLACE_ON_BB_RED_2_X=47;
    public static double PLACE_ON_BB_RED_2_Y=-35.5f;
    public static double PLACE_ON_BB_RED_2_ANGLE=0;

    public static double PLACE_ON_BB_RED_3_X=47;
    public static double PLACE_ON_BB_RED_3_Y=-42;
    public static double PLACE_ON_BB_RED_3_ANGLE=0;


    public static double RED_CLOSE_BEFORE_SPLINE_TO_STACK_X=-47;
    public static double RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y =-58;

    public static double RED_CLOSE_STACK_PRELOAD_X=-60;
    public static double RED_CLOSE_STACK_PRELOAD_Y=-36;

    public static double RED_CLOSE_BEFORE_MID_X=29;
    public static double RED_CLOSE_BEFORE_MID_Y=-58;
    public static double RED_CLOSE_BEFORE_MID_ANGLE=0;

    public static double RED_CLOSE_PLACE_ON_SPIKE_1_X=8;
    public static double RED_CLOSE_PLACE_ON_SPIKE_1_Y=-35;
    public static double RED_CLOSE_PLACE_ON_SPIKE_1_ANGLE =135;

    public static double RED_CLOSE_PLACE_ON_SPIKE_2_X=12;
    public static double RED_CLOSE_PLACE_ON_SPIKE_2_Y=-33.5f;

    public static double RED_CLOSE_PLACE_ON_SPIKE_3_X=18;
    public static double RED_CLOSE_PLACE_ON_SPIKE_3_Y=-35;
    public static double RED_CLOSE_PLACE_ON_SPIKE_3_ANGLE=60;

    public static double RED_FAR_PLACE_ON_SPIKE_1_X=-41;
    public static double RED_FAR_PLACE_ON_SPIKE_1_Y=-38;
    public static double RED_FAR_PLACE_ON_SPIKE_1_ANGLE =125;

    public static double RED_FAR_BACK_TRANSITION_1_X=-35;
    public static double RED_FAR_BACK_TRANSITION_1_Y=-52;
    public static double RED_FAR_BACK_TRANSITION_1_ANGLE=90;

    public static double RED_FAR_FRONT_TRANSITION_X=-35;
    public static double RED_FAR_FRONT_TRANSITION_Y=-12;

    public static double RED_FAR_FIRST_PIXELS_X=-59;
    public static double RED_FAR_FIRST_PIXELS_Y=-11.5;
    public static double RED_FAR_FIRST_PIXELS_ANGLE=0;

    public static double RED_FAR_BEFORE_SPLINE_TO_BB_X=31;
    public static double RED_FAR_BEFORE_SPLINE_TO_BB_Y=-12;
    public static double RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE=0;

    public static double EXTENDO_TO_STACK_RED_FAR_X=-23.5f;
    public static double EXTENDO_TO_STACK_RED_FAR_Y=-12;

    public static double RED_FAR_PLACE_ON_SPIKE_2_X=-35.5;
    public static double RED_FAR_PLACE_ON_SPIKE_2_Y=-34;

    public static double RED_FAR_TRANSITION_2_X=-45;
    public static double RED_FAR_TRANSITION_2_Y=-60;
    public static double RED_FAR_TRANSITION_2_ANGLE=0;

    public static double RED_FAR_PLACE_ON_SPIKE_3_X=-31;
    public static double RED_FAR_PLACE_ON_SPIKE_3_Y=-34.5;
    public static double RED_FAR_PLACE_ON_SPIKE_3_ANGLE=45;

    public static double BLUE_CLOSE_PLACE_ON_SPIKE_3_X=8;
    public static double BLUE_CLOSE_PLACE_ON_SPIKE_3_Y=35;
    public static double BLUE_CLOSE_PLACE_ON_SPIKE_3_ANGLE=-135;

    public static double PLACE_ON_BB_BLUE_3_X=47;
    public static double PLACE_ON_BB_BLUE_3_Y=42;
    public static double PLACE_ON_BB_BLUE_3_ANGLE=0;

    public static double BLUE_CLOSE_BEFORE_MID_X=29;
    public static double BLUE_CLOSE_BEFORE_MID_Y=58;
    public static double BLUE_CLOSE_BEFORE_MID_ANGLE=0;

    public static double BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X=-47;
    public static double BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y =58;

    public static double BLUE_CLOSE_STACK_PRELOAD_X=-60;
    public static double BLUE_CLOSE_STACK_PRELOAD_Y=36;

    public static double BLUE_CLOSE_PLACE_ON_SPIKE_2_X=12;
    public static double BLUE_CLOSE_PLACE_ON_SPIKE_2_Y=33.5f;

    public static double PLACE_ON_BB_BLUE_2_X=47;
    public static double PLACE_ON_BB_BLUE_2_Y=35.5f;
    public static double PLACE_ON_BB_BLUE_2_ANGLE=0;

    public static double BLUE_CLOSE_PLACE_ON_SPIKE_1_X=18;
    public static double BLUE_CLOSE_PLACE_ON_SPIKE_1_Y=35;
    public static double BLUE_CLOSE_PLACE_ON_SPIKE_1_ANGLE=-70;

    public static double PLACE_ON_BB_BLUE_1_X=47;
    public static double PLACE_ON_BB_BLUE_1_Y=42;
    public static double PLACE_ON_BB_BLUE_1_ANGLE=0;

    public static double BLUE_FAR_PLACE_ON_SPIKE_3_X=-41;
    public static double BLUE_FAR_PLACE_ON_SPIKE_3_Y=38;
    public static double BLUE_FAR_PLACE_ON_SPIKE_3_ANGLE =-125;

    public static double BLUE_FAR_BACK_TRANSITION_3_X=-35;
    public static double BLUE_FAR_BACK_TRANSITION_3_Y=54;
    public static double BLUE_FAR_BACK_TRANSITION_3_ANGLE=-90;

    public static double BLUE_FAR_FRONT_TRANSITION_X=-35;
    public static double BLUE_FAR_FRONT_TRANSITION_Y=12;

    public static double BLUE_FAR_FIRST_PIXELS_X=-59;
    public static double BLUE_FAR_FIRST_PIXELS_Y=11.5;
    public static double BLUE_FAR_FIRST_PIXELS_ANGLE=0;

    public static double BLUE_FAR_BEFORE_SPLINE_TO_BB_X=31;
    public static double BLUE_FAR_BEFORE_SPLINE_TO_BB_Y=12;
    public static double BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE=0;

    public static double EXTENDO_TO_STACK_BLUE_FAR_X=-23.5f;
    public static double EXTENDO_TO_STACK_BLUE_FAR_Y=12;

    public static double BLUE_FAR_PLACE_ON_SPIKE_2_X=-35.5;
    public static double BLUE_FAR_PLACE_ON_SPIKE_2_Y=34;

    public static double BLUE_FAR_TRANSITION_2_X=-38;
    public static double BLUE_FAR_TRANSITION_2_Y=60;
    public static double BLUE_FAR_TRANSITION_2_ANGLE=0;

    public static double BLUE_FAR_PLACE_ON_SPIKE_1_X=-31;
    public static double BLUE_FAR_PLACE_ON_SPIKE_1_Y=34.5;
    public static double BLUE_FAR_PLACE_ON_SPIKE_1_ANGLE=-45;

    public static void main(String[] args) {


     MeepMeep meepMeep=new MeepMeep(700);

        //RED CAZ STANGA FAR FROM BB
        RoadRunnerBotEntity CompleteBlueFar1 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_BLUE_FAR_X, START_POSE_BLUE_FAR_Y, Math.toRadians(START_POSE_BLUE_FAR_ANGLE)))

                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_PLACE_ON_SPIKE_1_X,BLUE_FAR_PLACE_ON_SPIKE_1_Y,Math.toRadians(BLUE_FAR_PLACE_ON_SPIKE_1_ANGLE)),Math.toRadians(-60)) //place purple pixel on spike
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_FIRST_PIXELS_X,BLUE_FAR_FIRST_PIXELS_Y,Math.toRadians(BLUE_FAR_FIRST_PIXELS_ANGLE)),Math.toRadians(180))
//FIRST PIXELS TO BB

                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_1_X,PLACE_ON_BB_BLUE_1_Y,Math.toRadians(PLACE_ON_BB_BLUE_1_ANGLE)),Math.toRadians(0))

//BB TO STACK CYCLE 1
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_BLUE_FAR_X,EXTENDO_TO_STACK_BLUE_FAR_Y))

//STACK TO BB CYCLE 1
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_1_X,PLACE_ON_BB_BLUE_1_Y,Math.toRadians(PLACE_ON_BB_BLUE_1_ANGLE)),Math.toRadians(0))

//BB TO STACK CYCLE 2
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_BLUE_FAR_X,EXTENDO_TO_STACK_BLUE_FAR_Y))

//STACK TO BB CYCLE 2
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_1_X,PLACE_ON_BB_BLUE_1_Y,Math.toRadians(PLACE_ON_BB_BLUE_1_ANGLE)),Math.toRadians(0))


                                        .build()
                );



        //BLUE CAZ MIJLOC FAR FROM BB
        RoadRunnerBotEntity CompleteBlueFar2 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_BLUE_FAR_X, START_POSE_BLUE_FAR_Y, Math.toRadians(START_POSE_BLUE_FAR_ANGLE)))

                                        .lineTo(new Vector2d(BLUE_FAR_PLACE_ON_SPIKE_2_X,BLUE_FAR_PLACE_ON_SPIKE_2_Y)) //place purple pixel on spike
                                        .lineToLinearHeading(new Pose2d(BLUE_FAR_TRANSITION_2_X,BLUE_FAR_TRANSITION_2_Y,Math.toRadians(BLUE_FAR_TRANSITION_2_ANGLE)))

                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_FIRST_PIXELS_X,BLUE_FAR_FIRST_PIXELS_Y,Math.toRadians(0)),Math.toRadians(180))
//FIRST PIXELS TO BB
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_2_X,PLACE_ON_BB_BLUE_2_Y,Math.toRadians(PLACE_ON_BB_BLUE_2_ANGLE)),Math.toRadians(0))

//BB TO STACK CYCLE 1
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_BLUE_FAR_X,EXTENDO_TO_STACK_BLUE_FAR_Y))

//STACK TO BB CYCLE 1
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_2_X,PLACE_ON_BB_BLUE_2_Y,Math.toRadians(PLACE_ON_BB_BLUE_2_ANGLE)),Math.toRadians(0))


//BB TO STACK CYCLE 2
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_BLUE_FAR_X,EXTENDO_TO_STACK_BLUE_FAR_Y))

//STACK TO BB CYCLE 2 && REMAIN PARKED
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_2_X,PLACE_ON_BB_BLUE_2_Y,Math.toRadians(PLACE_ON_BB_BLUE_2_ANGLE)),Math.toRadians(0))

                                        .build()
                );


        //BLUE CAZ DREAPTA FAR FROM BB
        RoadRunnerBotEntity CompleteBlueFar3 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_BLUE_FAR_X, START_POSE_BLUE_FAR_Y, Math.toRadians(START_POSE_BLUE_FAR_ANGLE)))

                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_PLACE_ON_SPIKE_3_X,BLUE_FAR_PLACE_ON_SPIKE_3_Y,Math.toRadians(BLUE_FAR_PLACE_ON_SPIKE_3_ANGLE)),Math.toRadians(-120)) //place purple pixel on spike
                                        .lineToLinearHeading(new Pose2d(BLUE_FAR_BACK_TRANSITION_3_X,BLUE_FAR_BACK_TRANSITION_3_Y,Math.toRadians(BLUE_FAR_BACK_TRANSITION_3_ANGLE)))

                                        .lineTo(new Vector2d(BLUE_FAR_FRONT_TRANSITION_X,BLUE_FAR_FRONT_TRANSITION_Y))
                                        .lineToLinearHeading(new Pose2d(BLUE_FAR_FIRST_PIXELS_X,BLUE_FAR_FIRST_PIXELS_Y,Math.toRadians(BLUE_FAR_FIRST_PIXELS_ANGLE)))
//FIRST PIXELS TO BB
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_3_X,PLACE_ON_BB_BLUE_3_Y,Math.toRadians(PLACE_ON_BB_BLUE_3_ANGLE)),Math.toRadians(0))
//BB TO STACK CYCLE 1
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_BLUE_FAR_X,EXTENDO_TO_STACK_BLUE_FAR_Y))
//STACK TO BB CYCLE 1
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_3_X,PLACE_ON_BB_BLUE_3_Y,Math.toRadians(PLACE_ON_BB_BLUE_3_ANGLE)),Math.toRadians(0))


//BB TO STACK CYCLE 2
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(BLUE_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_BLUE_FAR_X,EXTENDO_TO_STACK_BLUE_FAR_Y))

//STACK TO BB CYCLE 2
                                        .lineTo(new Vector2d(BLUE_FAR_BEFORE_SPLINE_TO_BB_X,BLUE_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_3_X,PLACE_ON_BB_BLUE_3_Y,Math.toRadians(PLACE_ON_BB_BLUE_3_ANGLE)),Math.toRadians(0))


                                        .build()
                );




        //BLUE CAZ STANGA CLOSE TO BB
        RoadRunnerBotEntity CompleteBlueClose1 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_BLUE_CLOSE_X, START_POSE_BLUE_CLOSE_Y, Math.toRadians(START_POSE_BLUE_CLOSE_ANGLE)))

                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_PLACE_ON_SPIKE_1_X,BLUE_CLOSE_PLACE_ON_SPIKE_1_Y,Math.toRadians(BLUE_CLOSE_PLACE_ON_SPIKE_1_ANGLE)),Math.toRadians(-60)) //place purple pixel on spike
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_1_X,PLACE_ON_BB_BLUE_1_Y,Math.toRadians(PLACE_ON_BB_BLUE_1_ANGLE)),Math.toRadians(-40)) //place yellow pixel on BB
///BB TO STACK CYCLE 1
                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y),Math.toRadians(BLUE_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_STACK_PRELOAD_X,BLUE_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))
///STACK TO BB CYCLE 1

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_BLUE_1_X,PLACE_ON_BB_BLUE_1_Y),Math.toRadians(PLACE_ON_BB_BLUE_1_ANGLE))

///BB TO STACK CYCLE 2

                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y),Math.toRadians(BLUE_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_STACK_PRELOAD_X,BLUE_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))

///STACK TO BB CYCLE 2 && REMAINS PARKED

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_BLUE_1_X,PLACE_ON_BB_BLUE_1_Y),Math.toRadians(PLACE_ON_BB_BLUE_1_ANGLE))


                                        .build()
                );



        //BLUE CAZ MIJLOC CLOSE TO BB
        RoadRunnerBotEntity CompleteBlueClose2 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_BLUE_CLOSE_X, START_POSE_BLUE_CLOSE_Y, Math.toRadians(START_POSE_BLUE_CLOSE_ANGLE)))

                                        .lineTo(new Vector2d(BLUE_CLOSE_PLACE_ON_SPIKE_2_X,BLUE_CLOSE_PLACE_ON_SPIKE_2_Y))
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_2_X ,PLACE_ON_BB_BLUE_2_Y,Math.toRadians(PLACE_ON_BB_BLUE_2_ANGLE)),Math.toRadians(0)) //place yellow pixel on BB
///BB TO STACK CYCLE 1

                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y),Math.toRadians(BLUE_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_STACK_PRELOAD_X,BLUE_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))


///STACK TO BB CYCLE 1

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_BLUE_2_X,PLACE_ON_BB_BLUE_2_Y),Math.toRadians(PLACE_ON_BB_BLUE_2_ANGLE))

///BB TO STACK CYCLE 2

                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y),Math.toRadians(BLUE_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_STACK_PRELOAD_X,BLUE_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))

///STACK TO BB CYCLE 2 && REMAINS PARKED

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_BLUE_2_X,PLACE_ON_BB_BLUE_2_Y),Math.toRadians(PLACE_ON_BB_BLUE_2_ANGLE))


                                        .build()
                );






        //BLUE CAZ STANGA CLOSE TO BB
        RoadRunnerBotEntity CompleteBlueClose3 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_BLUE_CLOSE_X, START_POSE_BLUE_CLOSE_Y, Math.toRadians(START_POSE_BLUE_CLOSE_ANGLE)))
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_PLACE_ON_SPIKE_3_X,BLUE_CLOSE_PLACE_ON_SPIKE_3_Y,Math.toRadians(BLUE_CLOSE_PLACE_ON_SPIKE_3_ANGLE)),Math.toRadians(-120)) //place purple pixel on spike
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_BLUE_3_X,PLACE_ON_BB_BLUE_3_Y,Math.toRadians(PLACE_ON_BB_BLUE_3_ANGLE)),Math.toRadians(0)) //place yellow pixel on BB

///BB TO STACK CYCLE 1
                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y),Math.toRadians(BLUE_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_STACK_PRELOAD_X,BLUE_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))
///STACK TO BB CYCLE 1

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_BLUE_3_X,PLACE_ON_BB_BLUE_3_Y),Math.toRadians(PLACE_ON_BB_BLUE_3_ANGLE))

///BB TO STACK CYCLE 2

                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y),Math.toRadians(BLUE_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_STACK_PRELOAD_X,BLUE_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))

///STACK TO BB CYCLE 2 && REMAINS PARKED

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_X,BLUE_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(BLUE_CLOSE_BEFORE_MID_X,BLUE_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_BLUE_3_X,PLACE_ON_BB_BLUE_3_Y),Math.toRadians(PLACE_ON_BB_BLUE_3_ANGLE))



                                        .build()


                );


        //RED CAZ DREAPTA FAR FROM BB
        RoadRunnerBotEntity CompleteRedFar3 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_RED_FAR_X, START_POSE_RED_FAR_Y, Math.toRadians(START_POSE_RED_FAR_ANGLE)))

                                        .splineToLinearHeading(new Pose2d(RED_FAR_PLACE_ON_SPIKE_3_X,RED_FAR_PLACE_ON_SPIKE_3_Y,Math.toRadians(RED_FAR_PLACE_ON_SPIKE_3_ANGLE)),Math.toRadians(60)) //place purple pixel on spike

                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_FIRST_PIXELS_X,RED_FAR_FIRST_PIXELS_Y,Math.toRadians(RED_FAR_FIRST_PIXELS_ANGLE)),Math.toRadians(180))

 //FIRST PIXELS TO BB
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_3_X,PLACE_ON_BB_RED_3_Y,Math.toRadians(PLACE_ON_BB_RED_3_ANGLE)),Math.toRadians(0))
//BB TO STACK CYCLE 1
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_RED_FAR_X,EXTENDO_TO_STACK_RED_FAR_Y))
//STACK TO BB CYCLE 1
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_3_X,PLACE_ON_BB_RED_3_Y,Math.toRadians(PLACE_ON_BB_RED_3_ANGLE)),Math.toRadians(0))


//BB TO STACK CYCLE 2
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_RED_FAR_X,EXTENDO_TO_STACK_RED_FAR_Y))

//STACK TO BB CYCLE 2
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_3_X,PLACE_ON_BB_RED_3_Y,Math.toRadians(PLACE_ON_BB_RED_3_ANGLE)),Math.toRadians(0))


                                        .build()
                );


        //RED CAZ MIJLOC FAR FROM BB
        RoadRunnerBotEntity CompleteRedFar2 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_RED_FAR_X, START_POSE_RED_FAR_Y, Math.toRadians(START_POSE_RED_FAR_ANGLE)))

                                        .lineTo(new Vector2d(RED_FAR_PLACE_ON_SPIKE_2_X,RED_FAR_PLACE_ON_SPIKE_2_Y)) //place purple pixel on spike
                                        .lineToLinearHeading(new Pose2d(RED_FAR_TRANSITION_2_X,RED_FAR_TRANSITION_2_Y,Math.toRadians(RED_FAR_TRANSITION_2_ANGLE)))

                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_FIRST_PIXELS_X,RED_FAR_FIRST_PIXELS_Y,Math.toRadians(0)),Math.toRadians(180))


//FIRST PIXELS TO BB
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_2_X,PLACE_ON_BB_RED_2_Y,Math.toRadians(PLACE_ON_BB_RED_2_ANGLE)),Math.toRadians(0))

//BB TO STACK CYCLE 1
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_RED_FAR_X,EXTENDO_TO_STACK_RED_FAR_Y))

//STACK TO BB CYCLE 1
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_2_X,PLACE_ON_BB_RED_2_Y,Math.toRadians(PLACE_ON_BB_RED_2_ANGLE)),Math.toRadians(0))


//BB TO STACK CYCLE 2
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_RED_FAR_X,EXTENDO_TO_STACK_RED_FAR_Y))

//STACK TO BB CYCLE 2 && REMAIN PARKED
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_2_X,PLACE_ON_BB_RED_2_Y,Math.toRadians(PLACE_ON_BB_RED_2_ANGLE)),Math.toRadians(0))

                                        .build()
                );


     //RED CAZ STANGA FAR FROM BB
        RoadRunnerBotEntity CompleteRedFar1 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_RED_FAR_X, START_POSE_RED_FAR_Y, Math.toRadians(START_POSE_RED_FAR_ANGLE)))

                                        .splineToLinearHeading(new Pose2d(RED_FAR_PLACE_ON_SPIKE_1_X,RED_FAR_PLACE_ON_SPIKE_1_Y,Math.toRadians(RED_FAR_PLACE_ON_SPIKE_1_ANGLE)),Math.toRadians(120)) //place purple pixel on spike
                                        .lineToLinearHeading(new Pose2d(RED_FAR_BACK_TRANSITION_1_X,RED_FAR_BACK_TRANSITION_1_Y,Math.toRadians(RED_FAR_BACK_TRANSITION_1_ANGLE)))

                                        .lineTo(new Vector2d(RED_FAR_FRONT_TRANSITION_X,RED_FAR_FRONT_TRANSITION_Y))
                                        .lineToLinearHeading(new Pose2d(RED_FAR_FIRST_PIXELS_X,RED_FAR_FIRST_PIXELS_Y,Math.toRadians(RED_FAR_FIRST_PIXELS_ANGLE)))
//FIRST PIXELS TO BB
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_1_X,PLACE_ON_BB_RED_1_Y,Math.toRadians(PLACE_ON_BB_RED_1_ANGLE)),Math.toRadians(0))
//BB TO STACK CYCLE 1
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_RED_FAR_X,EXTENDO_TO_STACK_RED_FAR_Y))
//STACK TO BB CYCLE 1
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_1_X,PLACE_ON_BB_RED_1_Y,Math.toRadians(PLACE_ON_BB_RED_1_ANGLE)),Math.toRadians(0))


//BB TO STACK CYCLE 2
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y,Math.toRadians(RED_FAR_BEFORE_SPLINE_TO_BB_ANGLE)),Math.toRadians(180))
                                        .lineTo(new Vector2d(EXTENDO_TO_STACK_RED_FAR_X,EXTENDO_TO_STACK_RED_FAR_Y))

//STACK TO BB CYCLE 2
                                        .lineTo(new Vector2d(RED_FAR_BEFORE_SPLINE_TO_BB_X,RED_FAR_BEFORE_SPLINE_TO_BB_Y))
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_1_X,PLACE_ON_BB_RED_1_Y,Math.toRadians(PLACE_ON_BB_RED_1_ANGLE)),Math.toRadians(0))


                                                .build()
                );


        //RED CAZ DREAPTA CLOSE TO BB
        RoadRunnerBotEntity CompleteRedClose3 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(START_POSE_RED_CLOSE_X, START_POSE_RED_CLOSE_Y, Math.toRadians(START_POSE_RED_CLOSE_ANGLE)))

                                        .splineToLinearHeading(new Pose2d(RED_CLOSE_PLACE_ON_SPIKE_3_X,RED_CLOSE_PLACE_ON_SPIKE_3_Y,Math.toRadians(RED_CLOSE_PLACE_ON_SPIKE_3_ANGLE)),Math.toRadians(60)) //place purple pixel on spike
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_3_X,PLACE_ON_BB_RED_3_Y,Math.toRadians(PLACE_ON_BB_RED_3_ANGLE)),Math.toRadians(40)) //place yellow pixel on BB
///BB TO STACK CYCLE 1
                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y),Math.toRadians(RED_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_CLOSE_STACK_PRELOAD_X,RED_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))
///STACK TO BB CYCLE 1

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_RED_3_X,PLACE_ON_BB_RED_3_Y),Math.toRadians(PLACE_ON_BB_RED_3_ANGLE))

///BB TO STACK CYCLE 2

                                        //BB TO MID
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y),Math.toRadians(RED_CLOSE_BEFORE_MID_ANGLE))

                                        //MID
                                        .lineTo(new Vector2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                        //SPLINE TO STACK(GO TO STACK)
                                        .setReversed(true)
                                        .splineToLinearHeading(new Pose2d(RED_CLOSE_STACK_PRELOAD_X,RED_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))

///STACK TO BB CYCLE 2 && REMAINS PARKED

                                        //SPLINE TO MID(GO TO BB)
                                        .setReversed(false)
                                        .splineToLinearHeading(new Pose2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                        //MID
                                        .lineTo(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y))

                                        //MID TO BB
                                        .setReversed(true)
                                        .splineToConstantHeading(new Vector2d(PLACE_ON_BB_RED_3_X,PLACE_ON_BB_RED_3_Y),Math.toRadians(PLACE_ON_BB_RED_3_ANGLE))


                                        .build()
                );



     //RED CAZ MIJLOC CLOSE TO BB
        RoadRunnerBotEntity CompleteRedClose2 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(START_POSE_RED_CLOSE_X, START_POSE_RED_CLOSE_Y, Math.toRadians(START_POSE_RED_CLOSE_ANGLE)))

                                .lineTo(new Vector2d(RED_CLOSE_PLACE_ON_SPIKE_2_X,RED_CLOSE_PLACE_ON_SPIKE_2_Y))
                                .setReversed(true)
                                .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_2_X ,PLACE_ON_BB_RED_2_Y,Math.toRadians(PLACE_ON_BB_RED_2_ANGLE)),Math.toRadians(0)) //place yellow pixel on BB
///BB TO STACK CYCLE 1

                                //BB TO MID
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y),Math.toRadians(RED_CLOSE_BEFORE_MID_ANGLE))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                //SPLINE TO STACK(GO TO STACK)
                                .setReversed(true)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_STACK_PRELOAD_X,RED_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))


///STACK TO BB CYCLE 1

                                //SPLINE TO MID(GO TO BB)
                                .setReversed(false)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y))

                                //MID TO BB
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(PLACE_ON_BB_RED_2_X,PLACE_ON_BB_RED_2_Y),Math.toRadians(PLACE_ON_BB_RED_2_ANGLE))

///BB TO STACK CYCLE 2

                                //BB TO MID
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y),Math.toRadians(RED_CLOSE_BEFORE_MID_ANGLE))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                //SPLINE TO STACK(GO TO STACK)
                                .setReversed(true)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_STACK_PRELOAD_X,RED_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))

///STACK TO BB CYCLE 2 && REMAINS PARKED

                                //SPLINE TO MID(GO TO BB)
                                .setReversed(false)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y))

                                //MID TO BB
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(PLACE_ON_BB_RED_2_X,PLACE_ON_BB_RED_2_Y),Math.toRadians(PLACE_ON_BB_RED_2_ANGLE))


                                .build()
                );


     //RED CAZ STANGA CLOSE TO BB
        RoadRunnerBotEntity CompleteRedClose1 = new DefaultBotBuilder(meepMeep)
                .setConstraints(60, 50, 5.7, 5.7, 13.22)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(START_POSE_RED_CLOSE_X, START_POSE_RED_CLOSE_Y, Math.toRadians(START_POSE_RED_CLOSE_ANGLE)))

                                .splineToLinearHeading(new Pose2d(RED_CLOSE_PLACE_ON_SPIKE_1_X,RED_CLOSE_PLACE_ON_SPIKE_1_Y,Math.toRadians(RED_CLOSE_PLACE_ON_SPIKE_1_ANGLE)),Math.toRadians(120)) //place purple pixel on spike
                                .setReversed(true)
                                .splineToLinearHeading(new Pose2d(PLACE_ON_BB_RED_1_X,PLACE_ON_BB_RED_1_Y,Math.toRadians(PLACE_ON_BB_RED_1_ANGLE)),Math.toRadians(0)) //place yellow pixel on BB
///BB TO STACK CYCLE 1
                                //BB TO MID
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y),Math.toRadians(RED_CLOSE_BEFORE_MID_ANGLE))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                //SPLINE TO STACK(GO TO STACK)
                                .setReversed(true)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_STACK_PRELOAD_X,RED_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))
///STACK TO BB CYCLE 1

                                //SPLINE TO MID(GO TO BB)
                                .setReversed(false)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y))

                                //MID TO BB
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(PLACE_ON_BB_RED_1_X,PLACE_ON_BB_RED_1_Y),Math.toRadians(PLACE_ON_BB_RED_1_ANGLE))

///BB TO STACK CYCLE 2

                                //BB TO MID
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y),Math.toRadians(RED_CLOSE_BEFORE_MID_ANGLE))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y))

                                //SPLINE TO STACK(GO TO STACK)
                                .setReversed(true)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_STACK_PRELOAD_X,RED_CLOSE_STACK_PRELOAD_Y,Math.toRadians(0)),Math.toRadians(180))

///STACK TO BB CYCLE 2 && REMAINS PARKED

                                //SPLINE TO MID(GO TO BB)
                                .setReversed(false)
                                .splineToLinearHeading(new Pose2d(RED_CLOSE_BEFORE_SPLINE_TO_STACK_X,RED_CLOSE_BEFORE_SPLINE_TO_STACK_Y,Math.toRadians(0)),Math.toRadians(0))

                                //MID
                                .lineTo(new Vector2d(RED_CLOSE_BEFORE_MID_X,RED_CLOSE_BEFORE_MID_Y))

                                //MID TO BB
                                .setReversed(true)
                                .splineToConstantHeading(new Vector2d(PLACE_ON_BB_RED_1_X,PLACE_ON_BB_RED_1_Y),Math.toRadians(PLACE_ON_BB_RED_1_ANGLE))


                                .build()
                );



        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                  .setDarkMode(true)
                  .addEntity(CompleteBlueFar3)
                  .setBackgroundAlpha(0.95f)
                  .start();

      }
    }






