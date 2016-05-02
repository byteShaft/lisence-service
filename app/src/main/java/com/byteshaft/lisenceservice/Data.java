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
    public static ArrayList<String []> alcholList;
    public static ArrayList<String []> fatigue;
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
    public static HashMap<String, String[]> answerListForGeneralKnowled;
    public static HashMap<String, String[]> answerListforICAC;
    public static HashMap<String, String[]> answerListForAlcoholAndDrug;
    public static HashMap<String, String[]> answerListForFatigueAndDefensiveDriving;
    private static ArrayList<String> categories;

    public Data() {
        categories = new ArrayList<>();
        generalList = new ArrayList<>();
        answerListForGeneralKnowled = new HashMap<>();
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

    public static void initializeAlcoholAndDrugs() {

        alcholList = new ArrayList<>();
        answerListForAlcoholAndDrug = new HashMap<>();

        alcholList.add(new String[] {"To reduce the effect of alcohol before driving or riding you should -", ""});
        answerListForAlcoholAndDrug.put("To reduce the effect of alcohol before driving or riding you should -",
                new String[] {
                        "Wait. The time depends on how much you have drunk.",
                        "Drink black coffee.",
                        "Have a glass of water.",
                        "0"});

        alcholList.add(new String[] {"Before driving a motor vehicle or riding a motor cycle it is safest -", ""});
        answerListForAlcoholAndDrug.put("Before driving a motor vehicle or riding a motor cycle it is safest -",
                new String[] {
                        "Drink 1 middy (285 ml) of light (low alcohol) beer.",
                        "Drink 1 nip of spirits (30 ml or 1 oz).",
                        "Not to drink any alcohol.",
                        "2"});

        alcholList.add(new String[] {"Is it an offence to refuse to take a POLICE breath test?", ""});
        answerListForAlcoholAndDrug.put("Is it an offence to refuse to take a POLICE breath test?",
                new String[] {
                        "Yes, always.",
                        "No, if you say you haven't been drinking alcohol.",
                        "No, if you are a learner driver.",
                        "0"});

        alcholList.add(new String[] {"If you take medicine and then drink alcohol -", ""});
        answerListForAlcoholAndDrug.put("If you take medicine and then drink alcohol -",
                new String[] {
                        "It can have a particularly bad effect on your driving ability.",
                        "The alcohol will have less effect than if taken alone.",
                        "Your ability to react to emergencies will improve.",
                        "0"});

        alcholList.add(new String[] {"If you are driving a bus, taxi, hire-car, heavy motor vehicle " +
                "(over 13.9 tonnes Gross Vehicle Mass), or a vehicle with a dangerous load, " +
                "it is an offence when the level of alcohol in your blood reaches -", ""});
        answerListForAlcoholAndDrug.put("If you are driving a bus, taxi, hire-car, heavy motor " +
                "vehicle (over 13.9 tonnes Gross Vehicle Mass), or a vehicle with a dangerous load," +
                " it is an offence when the level of alcohol in your blood reaches -",
                new String[] {
                        "0.02.",
                        "0.05.",
                        "0.08.",
                        "0"});

        alcholList.add(new String[] {"Having 1 or 2 alcoholic drinks before driving -", ""});
        answerListForAlcoholAndDrug.put("Having 1 or 2 alcoholic drinks before driving -",
                new String[] {
                        "Improves your driving ability.",
                        "Will affect your reactions and judgement.",
                        "Has no effect on your driving ability.\n",
                        "1"});

        alcholList.add(new String[] {"Even if you feel unaffected after drinking alcohol, you should -", ""});
        answerListForAlcoholAndDrug.put("Even if you feel unaffected after drinking alcohol, you should -",
                new String[] {
                        "Be aware that your abilities are decreased.",
                        "Drive, but avoid using freeways.",
                        "Spend more time than usual looking in the mirrors.",
                        "0"});

        alcholList.add(new String[] {"Alcohol is a depressant. This means -", ""});
        answerListForAlcoholAndDrug.put("Alcohol is a depressant. This means -",
                new String[] {
                        "It slows down how quickly your brain works.",
                        "It speeds your brain up so you can work better.",
                        "It makes you calm down and think more clearly.",
                        "0"});

        alcholList.add(new String[] {"After drinking alcohol you could -", ""});
        answerListForAlcoholAndDrug.put("After drinking alcohol you could -",
                new String[] {
                        "Misjudge speed (your own and others).",
                        "Be able to drive the same as you normally can.",
                        "Be able to pay close attention to details in the traffic.",
                        "0"});

        alcholList.add(new String[] {"If you are going out and going to drink alcohol," +
                " the best way to avoid having to drink and drive is to -", ""});
        answerListForAlcoholAndDrug.put("If you are going out and going to drink alcohol," +
                " the best way to avoid having to drink and drive is to -",
                new String[] {
                        "Organise before hand a way of getting home where you are not the driver.",
                        "After you have had a few drinks, start to think about how you will get home.",
                        "Wait for one hour after your last drink before you drive home.",
                        "0"});

        alcholList.add(new String[] {"When drivers have been drinking, the crashes they are involved in are generally -", ""});
        answerListForAlcoholAndDrug.put("When drivers have been drinking, the crashes they are involved in are generally -",
                new String[] {
                        "More serious.",
                        "Less serious.",
                        "About the same.",
                        "0"});

        alcholList.add(new String[] {"On Thursday, Friday and Saturday nights, how many serious crashes involve alcohol?", ""});
        answerListForAlcoholAndDrug.put("On Thursday, Friday and Saturday nights, how many serious crashes involve alcohol?",
                new String[] {
                        "About 50%.",
                        "About 30%.",
                        "About 10%.",
                        "0"});

        alcholList.add(new String[] {"What is the safest way to stay under the legal alcohol limit?", ""});
        answerListForAlcoholAndDrug.put("What is the safest way to stay under the legal alcohol limit?",
                new String[] {
                        "Buying a breathalyser (alcohol measuring instrument).",
                        "Exercising and drinking black coffee.",
                        "Not drinking any alcohol.",
                        "2"});

        alcholList.add(new String[] {"If you hold a learner or provisional licence class what " +
                "is the Blood Alcohol Concentration (BAC) limit?", ""});
        answerListForAlcoholAndDrug.put("If you hold a learner or provisional licence class " +
                "what is the Blood Alcohol Concentration (BAC) limit?",
                new String[] {
                        "Zero.",
                        "0.02.",
                        "0.05.",
                        "0"});

        alcholList.add(new String[] {"If you are taking any sort of medicine, you should -", ""});
        answerListForAlcoholAndDrug.put("If you are taking any sort of medicine, you should -",
                new String[] {
                        "Find out from your doctor or chemist whether the medicine or drug will " +
                                "affect your driving and act accordingly.",
                        "Only drive during the day after taking the medicine or drug.",
                        "Only drive a motor car not a heavy vehicle.",
                        "0"});

        alcholList.add(new String[] {"Before taking any drugs and then driving it is most important to -", ""});
        answerListForAlcoholAndDrug.put("Before taking any drugs and then driving it is most important to -",
                new String[] {
                        "Know what the effects of the drug are.",
                        "Plan to have some other person with you.",
                        "Have some food in your stomach.",
                        "0"});

        alcholList.add(new String[] {"If you have used illegal drugs you -", ""});
        answerListForAlcoholAndDrug.put("If you have used illegal drugs you -",
                new String[] {
                        "Should drink coffee before driving.",
                        "May drive only in light traffic.",
                        "Must not drive.",
                        "2"});

        alcholList.add(new String[] {"If you are affected by a legal drug, such as a medicine (e.g. cold or allergy tablets) -", ""});
        answerListForAlcoholAndDrug.put("If you are affected by a legal drug, such as a medicine (e.g. cold or allergy tablets) -",
                new String[] {
                        "You must not drive.",
                        "You must have a passenger to help you drive.",
                        "You may drive only in daylight hours.",
                        "0"});

        alcholList.add(new String[] {"You want to drive your car but you have a very bad headache." +
                " A friend gives you some of their headache tablets to kill the pain. " +
                "What should you do before you take these tablets?", ""});
        answerListForAlcoholAndDrug.put("You want to drive your car but you have a very bad " +
                "headache. A friend gives you some of their headache tablets to kill the pain." +
                " What should you do before you take these tablets?",
                new String[] {
                        "Read the label and confirm they are not prescription drugs and there are no special warnings on the label.",
                        "Ask your friend if the tablets have affected them.",
                        "Drink a large glass of milk because this reduces the adverse effects of medicines and drugs.",
                        "0"});

        alcholList.add(new String[] {"If you are taking several medications and you want to drive, you should -", ""});
        answerListForAlcoholAndDrug.put("If you are taking several medications and you want to drive, you should -",
                new String[] {
                        "Ask your doctor if the combination of drugs will make it dangerous to drive.",
                        "Drive carefully around your local streets to see if you are affected.",
                        "Ask your passengers to let you know if you are not driving as well as you should.",
                        "0"});
    }

    public static  void initilizeFatigueAndDefensiveDriving() {

        fatigue = new ArrayList<>();
        answerListForFatigueAndDefensiveDriving = new HashMap<>();

        fatigue.add(new String[] {"Under good conditions, when driving behind any vehicle, at any speed, you should -", ""});
        answerListForAlcoholAndDrug.put("Under good conditions, when driving behind any vehicle, at any speed, you should -",
                new String[] {
                        "Stay at least three seconds behind the vehicle in front of you.",
                        "Drive as close to the vehicle in front as possible.",
                        "Stay one second behind the vehicle in front of you.",
                        "0"});


        fatigue.add(new String[] {"When driving in wet weather, your vehicle will -", ""});
        answerListForAlcoholAndDrug.put("When driving in wet weather, your vehicle will -",
                new String[] {
                        "Take longer and further to stop, so slow down.",
                        "Stop in the same distance as on a dry road.",
                        "Handle better, so you can go faster.",
                        "0"});


        fatigue.add(new String[] {"At night, if an oncoming vehicle's headlights dazzle you, you should -", ""});
        answerListForAlcoholAndDrug.put("At night, if an oncoming vehicle's headlights dazzle you, you should -",
                new String[] {
                        "Slow down, until your eyes recover.",
                        "Watch the centre line of the road.",
                        "Close your eyes for a short time until they recover.",
                        "0"});

        fatigue.add(new String[] {"If you get sleepy while driving, it is best to -", ""});
        answerListForAlcoholAndDrug.put("If you get sleepy while driving, it is best to -",
                new String[] {
                        "Stop, rest, and change drivers if possible.",
                        "Turn on the radio very loud.",
                        "Turn on the air conditioning or open the windows.",
                        "0"});

        fatigue.add(new String[] {"In wet weather when it becomes hard for you to see, you should -", ""});
        answerListForAlcoholAndDrug.put("In wet weather when it becomes hard for you to see, you should -",
                new String[] {
                        "Turn on your headlights, slow down, and double your following distance behind the vehicle in front.",
                        "Turn your headlights on high beam.",
                        "Flash your headlights to warn other drivers.",
                        "0"});

        fatigue.add(new String[] {"If you are driving and it starts to rain, you should -", ""});
        answerListForAlcoholAndDrug.put("If you are driving and it starts to rain, you should -",
                new String[] {
                        "Slow down using the brake gently, since rain and oil may create a slippery surface.",
                        "Put your lights on high beam so you can see better.",
                        "Put your hazard warning lights on and increase your speed to avoid the rain.",
                        "0"});

        fatigue.add(new String[] {"When driving on a slippery wet road, for example, one covered in early morning dew, your vehicle will -", ""});
        answerListForAlcoholAndDrug.put("When driving on a slippery wet road, for example, one covered in early morning dew, your vehicle will -",
                new String[] {
                        "Be easier to steer and handle.",
                        "Be heavier to steer.",
                        "Take longer and further to stop.",
                        "2"});


        fatigue.add(new String[] {"Why should you avoid heavy braking on a wet road?", ""});
        answerListForAlcoholAndDrug.put("Why should you avoid heavy braking on a wet road?",
                new String[] {
                        "Your wheels may skid and cause a loss of control.",
                        "If the wheels lock up your handbrake may not work.",
                        "You might wet pedestrians walking along the footpath.",
                        "0"});

        fatigue.add(new String[] {"At night you should -", ""});
        answerListForAlcoholAndDrug.put("At night you should -",
                new String[] {
                        "Drive closer to the vehicle in front so they can see you better.",
                        "Leave a longer gap behind the vehicle in front.",
                        "Use your hazard warning lights when overtaking another vehicle.",
                        "1"});

        fatigue.add(new String[] {"When it is very foggy during the day or night and your vehicle has no fog lights, you should -", ""});
        answerListForAlcoholAndDrug.put("When it is very foggy during the day or night and your vehicle has no fog lights, you should -",
                new String[] {
                        "Slow down and use your low beam headlights and hazard warning lights to make your vehicle seen.",
                        "Put on your high beam lights.",
                        "Follow closer to other vehicles.",
                        "0"});

        fatigue.add(new String[] {"When going on a long trip, out of the following which is the most important to do?", ""});
        answerListForAlcoholAndDrug.put("When going on a long trip, out of the following which is the most important to do?",
                new String[] {
                        "Make sure your horn is working.",
                        "Have a good meal before driving.",
                        "Get plenty of rest before starting out.",
                        "2"});

        fatigue.add(new String[] {"At night, when you approach an oncoming vehicle, you should -", ""});
        answerListForAlcoholAndDrug.put("At night, when you approach an oncoming vehicle, you should -",
                new String[] {
                        "Carefully watch the vehicle by looking directly at its headlights.",
                        "Put your lights on high beam, to make your vehicle more easily seen.",
                        "Not look at its headlights, but keep left and watch the left of the road.",
                        "2"});

        fatigue.add(new String[] {"Which of the following attitudes is most likely to make you a safer driver?", ""});
        answerListForAlcoholAndDrug.put("Which of the following attitudes is most likely to make you a safer driver?",
                new String[] {
                        "When I drive, I have the main responsibility for my safety and the safety of other road users.",
                        "It is up to other drivers to avoid crashing into me.",
                        "Crashing or not crashing is a matter of luck.",
                        "0"});

        // added pic FD028
        fatigue.add(new String[] {"You are about to move away from the kerb in your car. What is the last thing you should do before you move into traffic?", "fd28"});
        answerListForAlcoholAndDrug.put("You are about to move away from the kerb in your car. What is the last thing you should do before you move into traffic?",
                new String[] {
                        "Check over your shoulder.",
                        "Adjust your seat.",
                        "Put on your seat belt.",
                        ""});

        fatigue.add(new String[] {"What is the best way to avoid hitting other vehicles, people or animals when moving off from the kerb?", ""});
        answerListForAlcoholAndDrug.put("What is the best way to avoid hitting other vehicles, people or animals when moving off from the kerb?",
                new String[] {
                        "Check your mirrors and look over your shoulder before moving off from the kerb.",
                        "Have a good look around while you walk up to your car and then drive off as soon as you can.",
                        "Sound your horn before moving away from the kerb to warn people of your intentions.",
                        "0"});

        fatigue.add(new String[] {"Many people crash within the first few years of driving. What is the best way of learning to drive on your own without crashing?", ""});
        answerListForAlcoholAndDrug.put("Many people crash within the first few years of driving. What is the best way of learning to drive on your own without crashing?",
                new String[] {
                        "Drive in every kind of traffic situation as soon as you get your licence.",
                        "Drive as much as you can with friends on the way to parties.",
                        "Start driving in daylight where it is not too busy and only drive in busier traffic as your driving gets better.\n",
                        "2"});

        fatigue.add(new String[] {"It is important to scan while driving so you can see everything that is happening on the road. What does scanning involve?", ""});
        answerListForAlcoholAndDrug.put("It is important to scan while driving so you can see everything that is happening on the road. What does scanning involve?",
                new String[] {
                        "Continually looking ahead, to the sides and using all mirrors when driving.",
                        "Looking in the rear and side mirrors continually when driving.",
                        "Looking further ahead down the road when driving.",
                        "0"});

        // added pic FD033
        fatigue.add(new String[] {"If you are a new driver and first start to drive at night you should -", "fd33"});
        answerListForAlcoholAndDrug.put("If you are a new driver and first start to drive at night you should -",
                new String[] {
                        "Drive mainly on streets that you know well.",
                        "Drive mainly in unfamiliar streets.",
                        "Drive long distances to improve your concentration.",
                        ""});

        fatigue.add(new String[] {"You set out on a fairly long drive to see some friends. After a while you start feeling tired. What should you do?", ""});
        answerListForAlcoholAndDrug.put("You set out on a fairly long drive to see some friends. After a while you start feeling tired. What should you do?",
                new String[] {
                        "Stop at a shop and get a drink that contains caffeine to help keep you awake.",
                        "Pull off the road, stop and rest until you no longer feel tired.",
                        "Make sure you get plenty of fresh air circulating inside the car by winding down your window.",
                        "1"});

        fatigue.add(new String[] {"You are driving an older relative for an appointment and are running late. They ask you to go faster to get there on time. You should -", ""});
        answerListForAlcoholAndDrug.put("You are driving an older relative for an appointment and are running late. They ask you to go faster to get there on time. You should -",
                new String[] {
                        "Choose a safe speed and say you will not go any faster.",
                        "Take the advice of a more experience driver and go faster where you can.",
                        "Drop them off at the train station.",
                        "0"});

        fatigue.add(new String[] {"You are planning to drive from Sydney to the Gold Coast with" +
                " some friends. To minimise fatigue and make the trip as safe as possible you should -", ""});
        answerListForAlcoholAndDrug.put("You are planning to drive from Sydney to the Gold Coast " +
                "with some friends. To minimise fatigue and make the trip as safe as possible you should -",
                new String[] {
                        "Aim to drive for as long as possible when you are feeling good so you can arrive earlier.",
                        "Drive mostly at night as there is less traffic on the road and therefore less risk of crashing.",
                        "Drive during the day, take plenty of breaks and share driving if possible.",
                        "2"});

        // added pic FD037
        fatigue.add(new String[] {"You should leave a gap between your vehicle and the one you are following. In good conditions the gap should be -", "fd37"});
        answerListForAlcoholAndDrug.put("You should leave a gap between your vehicle and the one you are following. In good conditions the gap should be -",
                new String[] {
                        "3 seconds.",
                        "1 seconds.",
                        "2 seconds.",
                        "0"});

        fatigue.add(new String[] {"It is night time and you are driving home from the movies." +
                " You are travelling in a line of vehicles. What size gap should you leave " +
                "between your vehicle and the vehicles in front of you?", ""});
        answerListForAlcoholAndDrug.put("It is night time and you are driving home from " +
                "the movies. You are travelling in a line of vehicles. What size gap should you " +
                "leave between your vehicle and the vehicles in front of you?",
                new String[] {
                        "A gap of about 4 seconds as it is easy to misjudge distances at night.",
                        "A gap of about 2 seconds so you can watch the vehicles in front closely and see when they are stopping.",
                        "The same 3-second gap you would leave during the day.",
                        "0"});

        fatigue.add(new String[] {"While driving, you come across aggressive, selfish or ignorant driving behaviour by another driver. You should -", ""});
        answerListForAlcoholAndDrug.put("While driving, you come across aggressive, selfish or ignorant driving behaviour by another driver. You should -",
                new String[] {
                        "Stay calm and in control of your vehicle at all times.",
                        "Respond by using your horn and/or flashing your lights to let the driver know how you feel.",
                        "Chase the car to tell the driver how to drive.",
                        "0"});

        fatigue.add(new String[] {"", ""});
        answerListForAlcoholAndDrug.put("",
                new String[] {
                        "",
                        "",
                        "",
                        ""});

        fatigue.add(new String[] {"", ""});
        answerListForAlcoholAndDrug.put("",
                new String[] {
                        "",
                        "",
                        "",
                        ""});

    }
    public static void initializeICAC() {

        ICAC = new ArrayList<>();
        answerListforICAC = new HashMap<>();

        ICAC.add("What will happen if you are caught cheating on the knowledge test?");
        answerListforICAC.put("What will happen if you are caught cheating on the knowledge test?",
                new String[]{"You will not be allowed to take another test for 6 weeks.",
                        "You will never be allowed to take another test.", "Nothing, there is no penalty.",
                        "0"
                });

        ICAC.add("What will happen if you offer a testing officer a bribe to pass your driving test?");
        answerListforICAC.put("What will happen if you offer a testing officer a bribe to pass your driving test?",
                new String[]{"Action will be taken against you. The penalties are severe and " +
                        "include fines and imprisonment.", "Only the testing officer will be investigated.",
                        "Nothing, there is no penalty.", "0"});

        ICAC.add("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to " +
                "him or her?");
        answerListforICAC.put("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to " +
                        "him or her?",
                new String[]{"Only the testing officer will be investigated.",
                        "Action will be taken against you. The penalties are severe and  " +
                                "include fines and imprisonment.",
                        "Nothing, there is no penalty.", "1"});


    }

    public static void initializeGeneralKnowledge() {

        generalList = new ArrayList<>();
        answerListForGeneralKnowled = new HashMap<>();
        generalList.add("Can a P1 or P2 provisional driver legally instruct a learner driver?");
        answerListForGeneralKnowled.put("Can a P1 or P2 provisional driver legally instruct a learner driver?",
                new String[]{"Yes, provided the provisional driver has held a P2 licence for more than 6 months.",
                        "No.",
                        "Yes, provided L and P1 or P2 plates are displayed.", "1"});

        generalList.add("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence " +
                "for a minimum period of?");
        answerListForGeneralKnowled.put("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence " +
                        "for a minimum period of?",
                new String[]{"24 months.", "12 months.", "18 months.", "1"});

        generalList.add("If one or two of your wheels run off the edge of the roadway, you should?");
        answerListForGeneralKnowled.put("If one or two of your wheels run off the edge of the roadway, you should?",
                new String[]{"Slow down gradually and ease back onto the road.",
                        "Slow down quickly by braking hard.",
                        "Increase your speed and drive back on the road.", "0"});

        generalList.add("If there are no lanes marked on the road, you should drive?");
        answerListForGeneralKnowled.put("If there are no lanes marked on the road, you should drive?",
                new String[]{"Anywhere on your side of the road.",
                        "Along the middle of the road.",
                        "Near to the left-hand side of the road.", "2"});

        generalList.add("If you intend to turn left, are you required to give a signal?");
        answerListForGeneralKnowled.put("If you intend to turn left, are you required to give a signal?",
                new String[]{"Yes, if turn signals are fitted to your vehicle.",
                        "No, if turning left from a lane marked left turn only.",
                        "No, if arrows are marked on the roadway.", "0"});

        generalList.add("What is meant by this sign on or near a bridge?");
        answerListForGeneralKnowled.put("What is meant by this sign on or near a bridge?",
                new String[]{"Stop at all times before crossing the bridge and only give " +
                        "way to pedestrians who may be crossing.",
                        "Slow down and be prepared to give way to " +
                                "vehicles travelling in the opposite direction.",
                        "Do not overtake a vehicle travelling in the same direction.", "1"});

        generalList.add("When reversing, you should?");
        answerListForGeneralKnowled.put("When reversing, you should?",
                new String[]{"Unbuckle your seat belt so you can reverse as quickly " +
                        "as possible.",
                        "Take care and never reverse for a greater " +
                                "distance and time than is necessary.",
                        "Sound your horn to warn other drivers.", "1"});

        generalList.add("How close can you park to another vehicle when parked parallel to the kerb?");
        answerListForGeneralKnowled.put("How close can you park to another vehicle when parked parallel to the kerb?",
                new String[]{"You must leave at least 1 metre front and back.",
                        "You must leave at least 2 metres from the front only.",
                        "You must leave at least 3 metres front and back.", "0"});

        generalList.add("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked " +
                "vehicle?");
        answerListForGeneralKnowled.put("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked " +
                        "vehicle?",
                new String[]{"Yes, if not obstructing traffic.",
                        "Yes, if delivering goods.",
                        "No, not at any time.", "2"});

        generalList.add("Do you have any responsibilities when opening a vehicle door on a roadway?");
        answerListForGeneralKnowled.put("Do you have any responsibilities when opening a vehicle door on a roadway?",
                new String[]{"Yes, you must not open a door if you are likely to cause danger to " +
                        "road users or impede traffic.",
                        "No, any following traffic must stop if the door interferes with its progress.",
                        "No, there is no regulation to cover this situation.", "0"});

        generalList.add("Are you permitted to park on a median strip or traffic island?");
        answerListForGeneralKnowled.put("Are you permitted to park on a median strip or traffic island?",
                new String[]{"No, not at any time.",
                        "Yes, in daylight hours.",
                        "Yes, but for no more than 30 minutes.", "0"});

        generalList.add("Are you permitted to park in the direction of the arrow?");
        answerListForGeneralKnowled.put("Are you permitted to park in the direction of the arrow?",
                new String[]{"Yes, if you are carrying two or more passengers.",
                        "Yes, provided no taxis are using the area.",
                        "No, not at any time.", "2"});

        generalList.add("When driving at sunset or dawn on a dark day, what should you do?");
        answerListForGeneralKnowled.put("When driving at sunset or dawn on a dark day, what should you do?",
                new String[]{"Turn on your lights on low beam.",
                        "Keep your sunglasses on to cut down headlight glare.",
                        "Turn on your hazard warning lights.", "0"});

        generalList.add("You are driving at night with your headlights on high beam. When should you dip your headlights?");
        answerListForGeneralKnowled.put("You are driving at night with your headlights on high beam. When should you dip your headlights?",
                new String[]{"Never, you are allowed to drive with your lights on high beam at all times.",
                        "When within 200 metres of an oncoming vehicle only.",
                        "When within 200 metres of the vehicle ahead or an oncoming one.", "2"});

        generalList.add("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus " +
                "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you " +
                "should?");
        answerListForGeneralKnowled.put("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus " +
                        "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you " +
                        "should?",
                new String[]{"Slow down, and give way to the bus as it has " +
                        "priority.",
                        "Sound your horn to stop the bus from pulling out.",
                        "Continue at your normal speed as the bus does not have " +
                                "priority.", "0"});

        generalList.add("Is it an offence to obstruct clear vision of your number plates?");
        answerListForGeneralKnowled.put("Is it an offence to obstruct clear vision of your number plates?",
                new String[]{
                        "Yes, at any time.",
                        "Yes, but it is legal for a towbar or bicycle rack to cover the rear number plate.",
                        "No, you are allowed to cover your number plates if you want to.",
                        "0"});

        generalList.add("Before driving on a freeway, which of the following should you do?");
        answerListForGeneralKnowled.put("Before driving on a freeway, which of the following should you do?",
                new String[]{
                        "Make sure your vehicle has enough fuel, oil, water and the correct tyre pressure.",
                        "Take your street directory in case you get lost.",
                        "Take something to calm your nerves before driving.",
                        "0"});

        generalList.add("What must you do if you miss your exit on a freeway?");
        answerListForGeneralKnowled.put("What must you do if you miss your exit on a freeway?", new String[]{
                "Continue until you reach the next appropriate exit.",
                "Stop, and reverse back along the freeway to the exit you missed.",
                "Stop immediately and turn around.", "0"});


        generalList.add("As you leave a freeway, which of the following should you check?");
        answerListForGeneralKnowled.put("As you leave a freeway, which of the following should you check?",
                new String[]{
                        "Your speed.",
                        "Fuel gauge.",
                        "Windscreen wipers.",
                        "0"});


        generalList.add("When can a private car travel in a lane marked by this sign?");
        answerListForGeneralKnowled.put("When can a private car travel in a lane marked by this sign?",
                new String[]{
                        "Only to overtake another vehicle.",
                        "When carrying at least two passengers.",
                        "Only within 100 metres of making a turn.",
                        "2"});

        generalList.add("Are you permitted to drive a car towing more than one trailer?");
        answerListForGeneralKnowled.put("Are you permitted to drive a car towing more than one trailer?",
                new String[]{
                        "No, not at all.",
                        "Yes, if the combined length of vehicle and trailers does not exceed 15 metres.",
                        "Yes, provided you have held a licence for two years.",
                        "0"});

        generalList.add("What must you do when you are towing a caravan to help other vehicles overtake?");
        answerListForGeneralKnowled.put("What must you do when you are towing a caravan to help other vehicles overtake?",
                new String[]{
                        "Drive at least 25 km/h below the speed limit.",
                        "Keep at least 60 metres behind heavy vehicles or other vehicles towing caravans.",
                        "Stop immediately and let the faster vehicle overtake.",
                        "1"});

        generalList.add("Are you permitted to tow a caravan with a person riding in the caravan?");
        answerListForGeneralKnowled.put("Are you permitted to tow a caravan with a person riding in the caravan?",
                new String[]{
                        "Yes, provided you do not exceed 60 km/h.",
                        "Yes, if the person(s) in the caravan are over 12 years of age.",
                        "No, not under any circumstances.",
                        "2"});

        generalList.add("Before driving a long distance at fast speed or carrying a full car load, you should -");
        answerListForGeneralKnowled.put("Before driving a long distance at fast speed or carrying a full car load, you should -",
                new String[]{
                        "Check your tyre pressure, and if necessary, increase it to what the manufacturer recommends.",
                        "Make sure you have a street directory, so you know where you are going.",
                        "Have a large meal and a cup of coffee.",
                        "0"});

        generalList.add("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -");
        answerListForGeneralKnowled.put("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -",
                new String[]{
                        "Brake, look for room to the left, sound your horn and flash your lights.",
                        "Slow down and hope that the driver will turn away.",
                        "Drive onto the wrong side of the road and hope the other vehicle does not do the same.",
                        "0"});

        generalList.add("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -");
        answerListForGeneralKnowled.put("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -",
                new String[]{
                        "Do not need to report the accident to the Police.",
                        "Must report the accident to the Police Station nearest to where the accident happened within 24 hours.",
                        "Only need to report the accident to the Police if someone was injured.",
                        "1"});

        generalList.add("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?");
        answerListForGeneralKnowled.put("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?",
                new String[]{
                        "You must let them see your licence, take details, and give the name and address of the vehicle's owner.",
                        "No details at all until you have contacted your insurance company.",
                        "Only your name and address details if a Policeman asks for them.",
                        "0"});

        generalList.add("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?");
        answerListForGeneralKnowled.put("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?",
                new String[]{
                        "Render every assistance and take immediate steps to have an ambulance notified. Then call the Police.\n",
                        "Only call the Police if the accident also resulted in over $500 worth of property damage.",
                        "Report the accident to Police within seven days.",
                        "0"});

        generalList.add("Stop signs or flashing lights at railway crossings should always be obeyed, because -");
        answerListForGeneralKnowled.put("Stop signs or flashing lights at railway crossings should always be obeyed, because -",
                new String[]{
                        "Trains are fast, heavy and cannot stop quickly.",
                        "Pedestrians might be crossing.",
                        "Car brakes often fail.",
                        "0"});

        generalList.add("You should not drive across a railway level crossing when -");
        answerListForGeneralKnowled.put("You should not drive across a railway level crossing when -",
                new String[]{
                        "Traffic is blocking the other side.",
                        "You are towing a caravan.",
                        "A station is nearby.",
                        "0"});

        generalList.add("You should use your right-hand indicator when -");
        answerListForGeneralKnowled.put("You should use your right-hand indicator when -",
                new String[]{
                        "You are about to stop.",
                        "You intend to move to the right, at any time.",
                        "You intend to slow down.",
                        "1"});

        generalList.add("When merging onto the freeway from the entrance, you should -");
        answerListForGeneralKnowled.put("When merging onto the freeway from the entrance, you should -",
                new String[]{
                        "Look for a large enough break in the traffic and adjust your speed so as to fit into the traffic flow.",
                        "Sound your horn, turn on your indicator lights and move onto the freeway.",
                        "Stop and check the traffic behind you on the entrance.",
                        "0"});

        generalList.add("If you see a sign indicating road repairs are going on, you should -");
        answerListForGeneralKnowled.put("If you see a sign indicating road repairs are going on, you should -",
                new String[]{
                        "Maintain the same speed.",
                        "Stop immediately and wait for instructions.",
                        "Slow down and watch for traffic controllers and instructions.",
                        "2"});

        generalList.add("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?");
        answerListForGeneralKnowled.put("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?",
                new String[]{
                        "Clearway restrictions apply - you must not stop during the clearway hours.",
                        "You may at any time, park along this part of the road for 1 hour only.",
                        "Bicycle riders must ride along the yellow line.",
                        "0"});

        generalList.add("If you see a horse and rider on the road what should you do?");
        answerListForGeneralKnowled.put("If you see a horse and rider on the road what should you do?",
                new String[]{
                        "Slow down and give them plenty of room.",
                        "Sound your horn to warn the rider.",
                        "Speed up to pass the horse.",
                        "0"});

        generalList.add("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                "drive this type of vehicle?");
        answerListForGeneralKnowled.put("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                        "drive this type of vehicle?",
                new String[]{"A heavy rigid vehicle licence."
                        , "A car licence."
                        , "A small bus licence.", "1"});
        generalList.add("What are you required to do if you develop a serious medical condition that could affect your " +
                "driving?");
        answerListForGeneralKnowled.put("What are you required to do if you develop a serious medical condition that could affect your " +
                "driving?", new String[]{"Hand your licence in at the nearest police station.",
                "Tell your doctor and let him or her notify the RTA.", "Once you become aware of the " +
                "condition you must notify the RTA.", "2"});
        generalList.add("A friend lends you his car. It is very noisy and blows a lot of smoke. He tells you the vehicle has " +
                "been given a defect notice but it's still OK to drive it. What should you do?");
        answerListForGeneralKnowled.put("A friend lends you his car. It is very noisy and blows a lot of smoke. He tells you the vehicle has " +
                        "been given a defect notice but it's still OK to drive it. What should you do?",
                new String[]{"Before you borrow the car check the defect notice to make sure it is " +
                        "legal to drive the car.", "Borrow the car, but always drive it 10 Km/h below the speed limit.",
                        "Borrow the car but only drive on streets where the car will not be a danger to " +
                                "others.", "0"});
        generalList.add("Your car registration expires today. You have your car inspected for registration renewal but it fails " +
                "the inspection. What should you do?");
        answerListForGeneralKnowled.put("Your car registration expires today. You have your car inspected for registration renewal but it fails " +
                "the inspection. What should you do?", new String[]{"You have seven days to have the car repaired, after which the RTA considers it to " +
                "be unregistered.", "After today you must not drive the car until it has been repaired, " +
                "passed another inspection and registered.", "Go to the RTA and ask them to renew your registration and tell them you will soon " +
                "get the car fixed.", "1"});
        generalList.add("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?");
        answerListForGeneralKnowled.put("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?", new String[]{
                "Yes, but you must get the puncture fixed within 24 hours.", "Yes, if the tyre is correctly inflated and the side walls of the tyre are in good " +
                "condition.", "No, it's illegal to drive a car with a smooth tyre even if it is the spare.", "2"});
        generalList.add("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?");
        answerListForGeneralKnowled.put("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?", new String[]{
                "Put up with the discomfort; you should not adjust another person's seat.",
                "Adjust the seat forward so it's right for you.", "Ask your friend for a cushion to place behind your back.", "1"});
        generalList.add("You hold an unrestricted licence and are driving at 100 km/h in the country and pass this sign. " +
                "What should you do?");
        answerListForGeneralKnowled.put("You hold an unrestricted licence and are driving at 100 km/h in the country and pass this sign. " +
                "What should you do?", new String[]{"You can continue to drive at 100 km/h if there are fences to stop " +
                "farm animals from getting on the road.", "For the next 5 kilometres you must not exceed 60 km/h unless you " +
                "pass an end farm animals speed limit sign.", "Slow down to a speed that will allow you to stop to " +
                "avoid crashing into farm animals on the road.", "2"});
        generalList.add("You are turning right from one of two right turn only lanes. How should you use your indicators?");
        answerListForGeneralKnowled.put("You are turning right from one of two right turn only lanes. How should you use your indicators?",
                new String[]{"Indicate with your right hand signal the " +
                        "same as any other right hand turn.", "You should not indicate at all because it might " +
                        "confuse other drivers.", "Indicating in this situation is optional. Give a right " +
                        "hand signal if you think it will help other road users.", "0"});
        generalList.add("You are approaching an intersection that has a red light camera. The lights turn yellow when you " +
                "are too close to stop safely. The lights go red as you get to the other side of the intersection. Will " +
                "you receive a penalty notice?");
        answerListForGeneralKnowled.put("You are approaching an intersection that has a red light camera. The lights turn yellow when you " +
                "are too close to stop safely. The lights go red as you get to the other side of the intersection. Will " +
                "you receive a penalty notice?", new String[]{"Possibly, because you were in the intersection when the lights turned red.", "No, because the camera only takes a photo if you cross the stop line " +
                "after the lights turn red.", "Yes, but a driver is entitled to advise the Police Service and have the case heard " +
                "by a court.", "1"});
        generalList.add("You are driving on a freeway and realise you forgot something at home. You want to go back for it. " +
                "Can you do a U-turn on this road?");
        answerListForGeneralKnowled.put("You are driving on a freeway and realise you forgot something at home. You want to go back for it. " +
                "Can you do a U-turn on this road?", new String[]{"Yes, any time.", "Yes, providing you use the gravel joining roads.",
                "No, not at any time.", "2"});
        generalList.add("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -");
        answerListForGeneralKnowled.put("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -", new String[]{"Take the child with you.", "Leave the child in the car.",
                "Ask an older person sitting nearby to watch the child.", "0"});
        generalList.add("You want to leave your automatic car parked on a street sloping uphill. You should -");
        answerListForGeneralKnowled.put("You want to leave your automatic car parked on a street sloping uphill. You should -",
                new String[]{"Park only on flat areas.", "Turn the wheels away from the kerb.",
                        "Put the handbrake on and put the " +
                                "transmission in \"P\" (park).", "2"});
        generalList.add("You have just passed this sign. Can you park on this road?");
        answerListForGeneralKnowled.put("You have just passed this sign. Can you park on this road?", new String[]{
                "No, not at any time.", "Yes.", "Yes, but only in daylight hours.", "0"});
        generalList.add("Where there are double dividing lines, you may park -");
        answerListForGeneralKnowled.put("Where there are double dividing lines, you may park -", new String[]{
                "At least three metres from the dividing lines.", "At least two metres from the dividing lines.",
                "One metre from the dividing lines.", "0"});
        generalList.add("If there are no signs or markings to advise you, can you choose any of these methods of parking?");
        answerListForGeneralKnowled.put("If there are no signs or markings to advise you, can you choose any of these methods of parking?",
                new String[]{"No, only N is correct.", "Yes. M, N and O are all legal.",
                        "Yes, N is best but M and O are quite legal.", "0"});
        generalList.add("You should angle park -");
        answerListForGeneralKnowled.put("You should angle park -", new String[]{"Where the road is very wide."
                , "Where there are markings or a sign indicating angle park.", "Where there is plenty of room from the " +
                "centre line.", "1"});
        generalList.add("This bridge has only just enough room for two vehicles. As you come close to it you should -");
        answerListForGeneralKnowled.put("This bridge has only just enough room for two vehicles. As you come close to it you should -",
                new String[]{"Sound your horn to warn the other driver.", "Maintain your speed, keeping to the limit.",
                        "Slow down and pay extra attention.", "2"});
        generalList.add("Which side mirror is adjusted best?");
        answerListForGeneralKnowled.put("Which side mirror is adjusted best?", new String[]{"Mirror B.", "Mirror A.", "Mirror C.", "1"});
        generalList.add("You should be particularly careful at this intersection because -");
        answerListForGeneralKnowled.put("You should be particularly careful at this intersection because -",
                new String[]{"Intersections cause crashes.", "The building blocks a good view of the " +
                        "side street.", "It looks a bit tricky.", "1"});
        generalList.add("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                "pressures you to go around the bike and drive faster. How should you respond?");
        answerListForGeneralKnowled.put("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                        "pressures you to go around the bike and drive faster. How should you respond?",
                new String[]{"Overtake the bike quickly and speed up to stop the other driver becoming " +
                        "aggressive.", "Go slower because the slower you go the safer you are.",
                        "Resist the pressure, stay calm and overtake the cyclist when it is " + "safe.",
                        "2"});
    }

}
