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
        answerList = new HashMap<>();
        ICAC.add("What will happen if you are caught cheating on the knowledge test?");
        answerList.put("What will happen if you are caught cheating on the knowledge test?",
                new String[]{"You will not be allowed to take another test for 6 weeks.",
                "You will never be allowed to take another test.", "Nothing, there is no penalty.", "0"});

        ICAC.add("What will happen if you offer a testing officer a bribe to pass your driving test?");
        answerList.put("What will happen if you offer a testing officer a bribe to pass your driving test?",
                new String[] {"Action will be taken against you. The penalties are severe and" +
                        "include fines and imprisonment.", "Only the testing officer will be investigated.",
                        "Nothing, there is no penalty.", "0"});

        ICAC.add("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to" +
                "him or her?");
        answerList.put("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to" +
                "him or her?",
                new String[] {"Only the testing officer will be investigated.",
                        "Action will be taken against you. The penalties are severe and " +
                        "include fines and imprisonment.",
                        "Nothing, there is no penalty.", "1"});

    }

    public static void initializeGeneralKnowledge() {

        generalList = new ArrayList<>();
        answerList = new HashMap<>();
        generalList.add("Can a P1 or P2 provisional driver legally instruct a learner driver?");
        answerList.put("Can a P1 or P2 provisional driver legally instruct a learner driver?",
                new String[] {"Yes, provided the provisional driver has held a P2 licence for more than 6 months.",
                        "No.",
                "Yes, provided L and P1 or P2 plates are displayed.", "1"});

        generalList.add("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence" +
                "for a minimum period of?");
        answerList.put("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence" +
                        "for a minimum period of?",
                new String[] {"24 months.", "12 months.", "18 months.", "1"});

        generalList.add("If one or two of your wheels run off the edge of the roadway, you should?");
        answerList.put("If one or two of your wheels run off the edge of the roadway, you should?",
                new String[] {"Slow down gradually and ease back onto the road.",
                "Slow down quickly by braking hard.",
                        "Increase your speed and drive back on the road.", "0"});

        generalList.add("If there are no lanes marked on the road, you should drive?");
        answerList.put("If there are no lanes marked on the road, you should drive?",
                new String[] {"Anywhere on your side of the road.",
                        "Along the middle of the road.",
                        "Near to the left-hand side of the road.", "2"});

        generalList.add("If you intend to turn left, are you required to give a signal?");
        answerList.put("If you intend to turn left, are you required to give a signal?",
                new String[] {"Yes, if turn signals are fitted to your vehicle.",
                        "No, if turning left from a lane marked left turn only.",
                        "No, if arrows are marked on the roadway.", "0"});

        generalList.add("What is meant by this sign on or near a bridge?");
        answerList.put("What is meant by this sign on or near a bridge?",
                new String[] {"Stop at all times before crossing the bridge and only give" +
                        "way to pedestrians who may be crossing.",
                        "Slow down and be prepared to give way to" +
                                "vehicles travelling in the opposite direction.",
                        "Do not overtake a vehicle travelling in the same direction.", "1"});

        generalList.add("When reversing, you should?");
        answerList.put("When reversing, you should?",
                new String[] {"Unbuckle your seat belt so you can reverse as quickly" +
                        "as possible.",
                        "Take care and never reverse for a greater" +
                                "distance and time than is necessary.",
                        "Sound your horn to warn other drivers.", "1"});

        generalList.add("How close can you park to another vehicle when parked parallel to the kerb?");
        answerList.put("How close can you park to another vehicle when parked parallel to the kerb?",
                new String[] {"You must leave at least 1 metre front and back.",
                        "You must leave at least 2 metres from the front only.",
                        "You must leave at least 3 metres front and back.", "0"});

        generalList.add("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked" +
                "vehicle?");
        answerList.put("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked" +
                        "vehicle?",
                new String[] {"Yes, if not obstructing traffic.",
                        "Yes, if delivering goods.",
                        "No, not at any time.", "2"});

        generalList.add("Do you have any responsibilities when opening a vehicle door on a roadway?");
        answerList.put("Do you have any responsibilities when opening a vehicle door on a roadway?",
                new String[] {"Yes, you must not open a door if you are likely to cause danger to" +
                        "road users or impede traffic.",
                        "No, any following traffic must stop if the door interferes with its progress.",
                        "No, there is no regulation to cover this situation.", "0"});

        generalList.add("Are you permitted to park on a median strip or traffic island?");
        answerList.put("Are you permitted to park on a median strip or traffic island?",
                new String[] {"No, not at any time.",
                        "Yes, in daylight hours.",
                        "Yes, but for no more than 30 minutes.", "0"});

        generalList.add("Are you permitted to park in the direction of the arrow?");
        answerList.put("Are you permitted to park in the direction of the arrow?",
                new String[] {"Yes, if you are carrying two or more passengers.",
                        "Yes, provided no taxis are using the area.",
                        "No, not at any time.", "2"});

        generalList.add("When driving at sunset or dawn on a dark day, what should you do?");
        answerList.put("When driving at sunset or dawn on a dark day, what should you do?",
                new String[] {"Turn on your lights on low beam.",
                        "Keep your sunglasses on to cut down headlight glare.",
                        "Turn on your hazard warning lights.", "0"});

        generalList.add("You are driving at night with your headlights on high beam. When should you dip your headlights?");
        answerList.put("You are driving at night with your headlights on high beam. When should you dip your headlights?",
                new String[] {"Never, you are allowed to drive with your lights on high beam at all times.",
                        "When within 200 metres of an oncoming vehicle only.",
                        "When within 200 metres of the vehicle ahead or an oncoming one.", "2"});

        generalList.add("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus" +
                "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you" +
                "should?");
        answerList.put("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus" +
                        "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you" +
                        "should?",
                new String[] {"Slow down, and give way to the bus as it has" +
                        "priority.",
                        "Sound your horn to stop the bus from pulling out.",
                        "Continue at your normal speed as the bus does not have" +
                                "priority.", "0"});
        
    }



}
