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
                "You will never be allowed to take another test.", "Nothing, there is no penalty."});
    }

    public static void initializeGeneralKnowledge() {
        generalList = new ArrayList<>();
        generalList.add("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                "drive this type of vehicle?");
        answerList.put("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                "drive this type of vehicle?", new String[] {"A heavy rigid vehicle licence." , "A car licence."
                , "A small bus licence.", "1"});
        generalList.add("What are you required to do if you develop a serious medical condition that could affect your " +
                "driving?");
        answerList.put("What are you required to do if you develop a serious medical condition that could affect your " +
                "driving?", new String[]{"Hand your licence in at the nearest police station.",
        "Tell your doctor and let him or her notify the RTA.", "Once you become aware of the " +
                "condition you must notify the RTA.", "2"});
        generalList.add("A friend lends you his car. It is very noisy and blows a lot of smoke. He tells you the vehicle has " +
                "been given a defect notice but it's still OK to drive it. What should you do?");
        answerList.put("A friend lends you his car. It is very noisy and blows a lot of smoke. He tells you the vehicle has " +
                "been given a defect notice but it's still OK to drive it. What should you do?",
                new String[]{"Before you borrow the car check the defect notice to make sure it is " +
                        "legal to drive the car.", "Borrow the car, but always drive it 10 Km/h below the speed limit.",
                "Borrow the car but only drive on streets where the car will not be a danger to " +
                        "others.", "0"});
        generalList.add("Your car registration expires today. You have your car inspected for registration renewal but it fails " +
                "the inspection. What should you do?");
        answerList.put("Your car registration expires today. You have your car inspected for registration renewal but it fails " +
                "the inspection. What should you do?", new String[] {"You have seven days to have the car repaired, after which the RTA considers it to " +
                "be unregistered.", "After today you must not drive the car until it has been repaired, " +
                "passed another inspection and registered.", "Go to the RTA and ask them to renew your registration and tell them you will soon " +
                "get the car fixed.", "1"});
        generalList.add("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?");
        answerList.put("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?", new String[] {
                "Yes, but you must get the puncture fixed within 24 hours.", "Yes, if the tyre is correctly inflated and the side walls of the tyre are in good " +
                "condition.", "No, it's illegal to drive a car with a smooth tyre even if it is the spare.", "2"});
        generalList.add("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?");
        answerList.put("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?", new String[]{
                "Put up with the discomfort; you should not adjust another person's seat.",
                "Adjust the seat forward so it's right for you.", "Ask your friend for a cushion to place behind your back.", "1" });
        generalList.add("You hold an unrestricted licence and are driving at 100 km/h in the country and pass this sign. " +
                "What should you do?");
        answerList.put("You hold an unrestricted licence and are driving at 100 km/h in the country and pass this sign. " +
                "What should you do?", new String[]{"You can continue to drive at 100 km/h if there are fences to stop " +
                "farm animals from getting on the road.", "For the next 5 kilometres you must not exceed 60 km/h unless you " +
                "pass an end farm animals speed limit sign.", "Slow down to a speed that will allow you to stop to " +
                "avoid crashing into farm animals on the road.", "2"});
        generalList.add("You are turning right from one of two right turn only lanes. How should you use your indicators?");
        answerList.put("You are turning right from one of two right turn only lanes. How should you use your indicators?",
                new String[]{"Indicate with your right hand signal the " +
                        "same as any other right hand turn.", "You should not indicate at all because it might " +
                        "confuse other drivers.", "Indicating in this situation is optional. Give a right " +
                        "hand signal if you think it will help other road users.", "0"});
        generalList.add("You are approaching an intersection that has a red light camera. The lights turn yellow when you " +
                "are too close to stop safely. The lights go red as you get to the other side of the intersection. Will " +
                "you receive a penalty notice?");
        answerList.put("You are approaching an intersection that has a red light camera. The lights turn yellow when you " +
                "are too close to stop safely. The lights go red as you get to the other side of the intersection. Will " +
                "you receive a penalty notice?", new String[]{"Possibly, because you were in the intersection when the lights turned red.", "No, because the camera only takes a photo if you cross the stop line " +
                "after the lights turn red.", "Yes, but a driver is entitled to advise the Police Service and have the case heard " +
                "by a court.", "1"});
        generalList.add("You are driving on a freeway and realise you forgot something at home. You want to go back for it. " +
                "Can you do a U-turn on this road?");
        answerList.put("You are driving on a freeway and realise you forgot something at home. You want to go back for it. " +
                "Can you do a U-turn on this road?", new String[] {"Yes, any time.", "Yes, providing you use the gravel joining roads.",
        "No, not at any time.", "2"});
        generalList.add("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -");
        answerList.put("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -", new String[] {"Take the child with you.", "Leave the child in the car.",
        "Ask an older person sitting nearby to watch the child.", "0"});
        generalList.add("You want to leave your automatic car parked on a street sloping uphill. You should -");
        answerList.put("You want to leave your automatic car parked on a street sloping uphill. You should -",
                new String[] {"Park only on flat areas.", "Turn the wheels away from the kerb.",
                "Put the handbrake on and put the " +
                        "transmission in \"P\" (park).", "2"});
        generalList.add("You have just passed this sign. Can you park on this road?");
        answerList.put("You have just passed this sign. Can you park on this road?", new String[] {
           "No, not at any time.", "Yes.", "Yes, but only in daylight hours.", "0"});
        generalList.add("Where there are double dividing lines, you may park -");
        answerList.put("Where there are double dividing lines, you may park -", new String[] {
                "At least three metres from the dividing lines.", "At least two metres from the dividing lines.",
                "One metre from the dividing lines.", "0"});
        generalList.add("If there are no signs or markings to advise you, can you choose any of these methods of parking?");
        answerList.put("If there are no signs or markings to advise you, can you choose any of these methods of parking?",
                new String[]{"No, only N is correct.", "Yes. M, N and O are all legal.",
                        "Yes, N is best but M and O are quite legal.", "0"});
        generalList.add("You should angle park -");
        answerList.put("You should angle park -", new String[] {"Where the road is very wide."
                , "Where there are markings or a sign indicating angle park.", "Where there is plenty of room from the " +
                "centre line.", "1"});
        generalList.add("This bridge has only just enough room for two vehicles. As you come close to it you should -");
        answerList.put("This bridge has only just enough room for two vehicles. As you come close to it you should -",
                new String[] {"Sound your horn to warn the other driver.", "Maintain your speed, keeping to the limit.",
                        "Slow down and pay extra attention.", "2"});
        generalList.add("Which side mirror is adjusted best?");
        answerList.put("Which side mirror is adjusted best?",new String[]{"Mirror B.", "Mirror A.", "Mirror C.", "1"});
        generalList.add("You should be particularly careful at this intersection because -");
        answerList.put("You should be particularly careful at this intersection because -",
                new String[] {"Intersections cause crashes.", "The building blocks a good view of the " +
                        "side street.", "It looks a bit tricky.", "1"});
        generalList.add("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                "pressures you to go around the bike and drive faster. How should you respond?");
        answerList.put("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                "pressures you to go around the bike and drive faster. How should you respond?",
                new String[]{"Overtake the bike quickly and speed up to stop the other driver becoming " +
                        "aggressive.", "Go slower because the slower you go the safer you are.",
                "Resist the pressure, stay calm and overtake the cyclist when it is " +"safe.",
                "2"});
    }



}
