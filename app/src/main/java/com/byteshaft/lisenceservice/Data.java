package com.byteshaft.lisenceservice;

import java.util.ArrayList;
import java.util.HashMap;

public class Data {

    public static final String sICAC = "ICAC";
    public static final String sGeneralKnowledge = "General Knowledge";
    public static final String sAlcholDrugs = "Alcohol and Drugs";
    public static final String sFatigueAndDefensiveDriving = "Fatigue and Defensive Driving";
    public static final String sIntersections = "Intersections";
    public static final String sNegligentDriving = "Negligent Driving";
    public static final String sPedestrians = "Pedestrians";
    public static final String sSeatBeltsRestraints = "Seat Belts / Restraints";
    public static final String sSpeedLimits = "Speed Limits";
    public static final String sTrafficLightsLanes = "Traffic Lights / Lanes";
    public static final String sTrafficLightsLanes2 = "Traffic Lights / Lanes-2";
    public static ArrayList<String> ICAC;
    public static HashMap<String, String[]> ICACANS;
    private static ArrayList<String> generalList;
    public static ArrayList<String> alcholList;
    public static ArrayList<String> fatigue;
    public static ArrayList<String> intersection;
    public static ArrayList<String> negligentDriving;
    public static ArrayList<String> pedestrains;
    public static ArrayList<String> seatBelts;
    public static ArrayList<String> speedLimits;
    public static ArrayList<String> trafficLights;
    public static ArrayList<String> trafficLights2;


//    Alcohol and Drugs
//    Fatigue and Defensive Driving
//    Intersections
//    Traffic Lights / Lanes
//    Negligent Driving
//    Pedestrians
//    Seat Belts / Restraints
//    Speed Limits
//    Traffic Lights / Lanes

//    public static ArrayList<String> sQuestionsList;
    public static HashMap<String, String[]> answerList;
    private static ArrayList<String> categories;

    public Data() {
        categories = new ArrayList<>();
        generalList = new ArrayList<>();
        answerList = new HashMap<>();
    }

    public static void initializeCategoriesArray() {
        categories.add(sICAC);
        categories.add(sGeneralKnowledge);
        categories.add(sAlcholDrugs);
        categories.add(sFatigueAndDefensiveDriving);
        categories.add(sIntersections);
        categories.add(sTrafficLightsLanes);
        categories.add(sNegligentDriving);
        categories.add(sPedestrians);
        categories.add(sSeatBeltsRestraints);
        categories.add(sSpeedLimits);
        categories.add(sTrafficLightsLanes);
        categories.add(sTrafficLightsLanes2);
    }

    public static void initializeSelected(String selectedCategory) {
        switch (selectedCategory) {
            case sGeneralKnowledge:

                break;
            case sAlcholDrugs:

                break;
            case sFatigueAndDefensiveDriving:

                break;
            case sIntersections:

                break;
            case sTrafficLightsLanes:

                break;
            case sNegligentDriving:

                break;
            case sPedestrians:

                break;
            case sSeatBeltsRestraints:

                break;
            case sSpeedLimits:

                break;
            case sTrafficLightsLanes2:

                break;
        }

    }

    public static void initializeICAC() {
        ICAC = new ArrayList<>();
        ICACANS = new HashMap<>();
        ICAC.add("What will happen if you are caught cheating on the knowledge test?");
        answerList.put("What will happen if you are caught cheating on the knowledge test?",
                new String[]{"You will not be allowed to take another test for 6 weeks.",
                "You will never be allowed to take another test.", "Nothing, there is no penalty.",
                "0"
                });

        ICAC.add("Is it an offence to obstruct clear vision of your number plates?");
        answerList.put("Is it an offence to obstruct clear vision of your number plates?",
                new String[] {
                        "Yes, at any time.",
                        "Yes, but it is legal for a towbar or bicycle rack to cover the rear number plate.",
                        "No, you are allowed to cover your number plates if you want to.",
                        "0"});

        ICAC.add("Before driving on a freeway, which of the following should you do?");
        answerList.put("Before driving on a freeway, which of the following should you do?",
                new String[] {
                        "Make sure your vehicle has enough fuel, oil, water and the correct tyre pressure.",
                        "Take your street directory in case you get lost.",
                        "Take something to calm your nerves before driving.",
                        "0"});

        ICAC.add("What must you do if you miss your exit on a freeway?");
        answerList.put("What must you do if you miss your exit on a freeway?", new String[] {
                "Continue until you reach the next appropriate exit.",
                "Stop, and reverse back along the freeway to the exit you missed.",
        "Stop immediately and turn around.", "0"});


        ICAC.add("As you leave a freeway, which of the following should you check?");
        answerList.put("As you leave a freeway, which of the following should you check?",
                new String[] {
                        "Your speed.",
                        "Fuel gauge.",
                        "Windscreen wipers.",
                        "0"});


        ICAC.add("When can a private car travel in a lane marked by this sign?");
        answerList.put("When can a private car travel in a lane marked by this sign?",
                new String[] {
                        "Only to overtake another vehicle.",
                        "When carrying at least two passengers.",
                        "Only within 100 metres of making a turn.",
                        "2"});

        ICAC.add("Are you permitted to drive a car towing more than one trailer?");
        answerList.put("Are you permitted to drive a car towing more than one trailer?",
                new String[] {
                        "No, not at all.",
                        "Yes, if the combined length of vehicle and trailers does not exceed 15 metres.",
                        "Yes, provided you have held a licence for two years.",
                        "0" });

        ICAC.add("What must you do when you are towing a caravan to help other vehicles overtake?");
        answerList.put("What must you do when you are towing a caravan to help other vehicles overtake?",
                new String[] {
                        "Drive at least 25 km/h below the speed limit.",
                        "Keep at least 60 metres behind heavy vehicles or other vehicles towing caravans.",
                        "Stop immediately and let the faster vehicle overtake.",
                        "1"});

        ICAC.add("Are you permitted to tow a caravan with a person riding in the caravan?");
        answerList.put("Are you permitted to tow a caravan with a person riding in the caravan?",
                new String[] {
                        "Yes, provided you do not exceed 60 km/h.",
                        "Yes, if the person(s) in the caravan are over 12 years of age.",
                        "No, not under any circumstances.",
                        "2"});

        ICAC.add("Before driving a long distance at fast speed or carrying a full car load, you should -");
        answerList.put("Before driving a long distance at fast speed or carrying a full car load, you should -",
                new String[] {
                        "Check your tyre pressure, and if necessary, increase it to what the manufacturer recommends.",
                        "Make sure you have a street directory, so you know where you are going.",
                        "Have a large meal and a cup of coffee.",
                        "0"});

        ICAC.add("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -");
        answerList.put("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -",
                new String[] {
                        "Brake, look for room to the left, sound your horn and flash your lights.",
                        "Slow down and hope that the driver will turn away.",
                        "Drive onto the wrong side of the road and hope the other vehicle does not do the same.",
                        "0"});

        ICAC.add("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -");
        answerList.put("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -",
                new String[] {
                        "Do not need to report the accident to the Police.",
                        "Must report the accident to the Police Station nearest to where the accident happened within 24 hours.",
                        "Only need to report the accident to the Police if someone was injured.",
                        "1"});

        ICAC.add("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?");
        answerList.put("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?",
                new String[] {
                        "You must let them see your licence, take details, and give the name and address of the vehicle's owner.",
                        "No details at all until you have contacted your insurance company.",
                        "Only your name and address details if a Policeman asks for them.",
                        "0"});

        ICAC.add("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?");
        answerList.put("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?",
                new String[] {
                        "Render every assistance and take immediate steps to have an ambulance notified. Then call the Police.\n",
                        "Only call the Police if the accident also resulted in over $500 worth of property damage.",
                        "Report the accident to Police within seven days.",
                        "0"});

        ICAC.add("Stop signs or flashing lights at railway crossings should always be obeyed, because -");
        answerList.put("Stop signs or flashing lights at railway crossings should always be obeyed, because -",
                new String[] {
                        "Trains are fast, heavy and cannot stop quickly.",
                        "Pedestrians might be crossing.",
                        "Car brakes often fail.",
                        "0"});

        ICAC.add("You should not drive across a railway level crossing when -");
        answerList.put("You should not drive across a railway level crossing when -",
                new String[] {
                        "Traffic is blocking the other side.",
                        "You are towing a caravan.",
                        "A station is nearby.",
                        "0"});

        ICAC.add("You should use your right-hand indicator when -");
        answerList.put("You should use your right-hand indicator when -",
                new String[] {
                        "You are about to stop.",
                        "You intend to move to the right, at any time.",
                        "You intend to slow down.",
                        "1"});

        ICAC.add("When merging onto the freeway from the entrance, you should -");
        answerList.put("When merging onto the freeway from the entrance, you should -",
                new String[] {
                        "Look for a large enough break in the traffic and adjust your speed so as to fit into the traffic flow.",
                        "Sound your horn, turn on your indicator lights and move onto the freeway.",
                        "Stop and check the traffic behind you on the entrance.",
                        "0" });

        ICAC.add("If you see a sign indicating road repairs are going on, you should -");
        answerList.put("If you see a sign indicating road repairs are going on, you should -",
                new String[] {
                        "Maintain the same speed.",
                        "Stop immediately and wait for instructions.",
                        "Slow down and watch for traffic controllers and instructions.",
                        "2"});

        ICAC.add("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?");
        answerList.put("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?",
                new String[] {
                        "Clearway restrictions apply - you must not stop during the clearway hours.",
                        "You may at any time, park along this part of the road for 1 hour only.",
                        "Bicycle riders must ride along the yellow line.",
                        "0"});

        ICAC.add("If you see a horse and rider on the road what should you do?");
        answerList.put("If you see a horse and rider on the road what should you do?",
                new String[] {
                        "Slow down and give them plenty of room.",
                        "Sound your horn to warn the rider.",
                        "Speed up to pass the horse.",
                        "0"});

    }

    public static void initializeGeneralKnowledge() {
        
    }

}
