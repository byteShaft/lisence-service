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
    public static ArrayList<String[]> trafficSignsSection;
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
    public static HashMap<String, String[]> answerListForGeneralKnowled;
    public static HashMap<String, String[]> answerListforICAC;
    public static HashMap<String, String[]> answerListforTrafficSignsSections;
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
        answerListForGeneralKnowled = new HashMap<>();

        alcholList.add("");
        answerListForGeneralKnowled.put("",
                new String[]{
                        "",
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
                        "the inspection. What should you do?",
                new String[]{"You have seven days to have the car repaired, after which the RTA considers it to " +
                        "be unregistered.",
                        "After today you must not drive the car until it has been repaired, " +
                                "passed another inspection and registered.",
                        "Go to the RTA and ask them to renew your registration and tell them you will soon " +
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
        answerListForGeneralKnowled.put("Which side mirror is adjusted best?",
                new String[]{"Mirror B.", "Mirror A.", "Mirror C.", "1"});


        generalList.add("You should be particularly careful at this intersection because");
        answerListForGeneralKnowled.put("You should be particularly careful at this intersection because",
                new String[]{"Intersections cause crashes.",
                        "The building blocks a good view of the " +
                                "side street.", "It looks a bit tricky.", "1"});


        generalList.add("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                "pressures you to go around the bike and drive faster. How should you respond?");
        answerListForGeneralKnowled.put("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                        "pressures you to go around the bike and drive faster. How should you respond?",
                new String[]{"Overtake the bike quickly and speed up to stop the other driver becoming " +
                        "aggressive.", "Go slower because the slower you go the safer you are.",
                        "Resist the pressure, stay calm and overtake the cyclist when it is " + "safe.",
                        "2"});

        generalList.add("You hear the siren of an ambulance approaching you from behind. You should?");
        answerListForGeneralKnowled.put("You hear the siren of an ambulance approaching you from behind. You should?",
                new String[]{
                        "Move into the left lane.",
                        "Slow down to the speed of other traffic.",
                        "Continue at the same speed.",
                        "0"});

        generalList.add("You are driving along this road. You hear an ambulance's siren and see the ambulance in your\n" +
                "mirror. You should?");
        answerListForGeneralKnowled.put("You are driving along this road. You hear an ambulance's siren and see the ambulance in your\n" +
                        "mirror. You should?",
                new String[]{
                        "Move to the left and make way for the ambulance.",
                        "Turn into a driveway on the right hand side of the road",
                        "- Move to the right and make way for the ambulance.",
                        "0"});

        generalList.add("You are about to make a right hand turn at this intersection. You have the green light. You hear a\n" +
                "siren and then see that a fire truck will soon overtake you. You should?");
        answerListForGeneralKnowled.put("You are about to make a right hand turn at this intersection. You have the green light. You hear a\n" +
                        "siren and then see that a fire truck will soon overtake you. You should?",
                new String[]{
                        "Stop and let the fire truck overtake you.",
                        "Continue and make the turn because you have the right of way.",
                        "Speed up to beat the fire truck.",
                        "0"});

        generalList.add("When you come across roadworks?");
        answerListForGeneralKnowled.put("When you come across roadworks?",
                new String[]{
                        "You must obey the signs that are displayed at all times.",
                        "You only have to obey the signs when there are workers about.",
                        "You only have to obey the signs during working hours.",
                        "0"});

        generalList.add("Generally, if you hear the siren of an emergency vehicle you should?");
        answerListForGeneralKnowled.put("Generally, if you hear the siren of an emergency vehicle you should?",
                new String[]{
                        "Pull over to the left until the emergency vehicle passes.",
                        "Immediately come to a stop.",
                        "Let the emergency vehicle pass and follow it closely behind.",
                        "0"});

        generalList.add("You are approaching a green light in vehicle A. An ambulance sounding its siren is approaching\n" +
                "the same intersection and has a red light. You should?");
        answerListForGeneralKnowled.put("You are approaching a green light in vehicle A. An ambulance sounding its siren is approaching\n" +
                        "the same intersection and has a red light. You should?",
                new String[]{
                        "Slow down and stop if necessary to prevent\n" +
                                "getting in its way.",
                        "Keep driving because you have the green light.",
                        "Pull over to the left before you reach the intersection.",
                        "0"});

        generalList.add("When you see these lights flashing on the back of a bus, what should you do?");
        answerListForGeneralKnowled.put("When you see these lights flashing on the back of a bus, what should you do?",
                new String[]{
                        "Drive carefully at no more than 40 km/h.",
                        "Overtake the bus only while the lights are flashing.",
                        "Stop and wait for the lights to stop flashing.",
                        "0"});

        generalList.add("You are driving at night and there is no other traffic around you. When can you use your headlights\n" +
                "on high beam?");
        answerListForGeneralKnowled.put("You are driving at night and there is no other traffic around you. When can you use your headlights\n" +
                        "on high beam?",
                new String[]{
                        "On any road, even if there are street lights.",
                        "On any road where the speed limit is above 80 km/h.",
                        "Only on roads that do not have street lights.",
                        "0"});

        generalList.add("You want to park your vehicle for a short time. It is night time. You should?");
        answerListForGeneralKnowled.put("You want to park your vehicle for a short time. It is night time. You should?",
                new String[]{
                        "Pick a visible position or leave the parking\n" +
                                "or hazard lights on.",
                        "Park on the footpath.",
                        "Leave your headlights on high beam.",
                        "0"});

        generalList.add("You drive up to a corner where you see some loose gravel on the road. You should?");
        answerListForGeneralKnowled.put("You drive up to a corner where you see some loose gravel on the road. You should?",
                new String[]{
                        "Slow down.",
                        "Check the mirrors and change lanes.",
                        "Speed up and drive over the gravel as quickly as possible.",
                        "0"});

        generalList.add("When you are driving on a two-lane freeway, which lane should you choose?");
        answerListForGeneralKnowled.put("When you are driving on a two-lane freeway, which lane should you choose?",
                new String[]{
                        "The left lane unless you are overtaking.",
                        "Whichever lane has the least traffic..",
                        "The right lane to avoid slow-moving vehicles.",
                        "0"});

        generalList.add("When there are three lanes on a freeway?");
        answerListForGeneralKnowled.put("When there are three lanes on a freeway?",
                new String[]{
                        "The right lane is reserved for overtaking.",
                        "The right lane is for emergency vehicles only.",
                        "The right lane is for avoiding most traffic.",
                        "0"});

        generalList.add("When you see the headlights flashing on the front of a bus, what should you do?");
        answerListForGeneralKnowled.put("When you see the headlights flashing on the front of a bus, what should you do?",
                new String[]{
                        "Be careful, there may be children about.",
                        "Drive past the bus only while the lights are flashing.",
                        "Stop and wait for the lights to stop flashing.",
                        "0"});

        generalList.add("You are driving your vehicle along a street and want to stop for\n" +
                "a short time. Are you allowed to double park your vehicle (that\n" +
                "is stand it on the road alongside a parked car)?");
        answerListForGeneralKnowled.put("You are driving your vehicle along a street and want to stop for\n" +
                        "a short time. Are you allowed to double park your vehicle (that\n" +
                        "is stand it on the road alongside a parked car)?",
                new String[]{
                        "No, never.",
                        "Yes, provided you do not leave the vehicle.",
                        "Yes, provided you stop for a short time only and turn on your hazard warning lights.",
                        "0"});

        generalList.add("Looking at the diagrams, how far from the approach\n" +
                "side of a bus stop or a railway crossing are you allowed\n" +
                "to stand or park your vehicle?");
        answerListForGeneralKnowled.put("Looking at the diagrams, how far from the approach\n" +
                        "side of a bus stop or a railway crossing are you allowed\n" +
                        "to stand or park your vehicle?",
                new String[]{
                        "At least 20 metres.",
                        "At least 50 metres.",
                        "At least 5 metres.",
                        "0"});

        generalList.add("Are you allowed to use a hand-held mobile phone while driving a car?");
        answerListForGeneralKnowled.put("Are you allowed to use a hand-held mobile phone while driving a car?   ",
                new String[]{
                        "No.",
                        "Yes, but only when you stop at intersections.",
                        "Yes, but you must hold the steering wheel with at least one hand.",
                        "0"});

        generalList.add("Are you required to carry your driver’s licence with you every time you drive?");
        answerListForGeneralKnowled.put("Are you required to carry your driver’s licence with you every time you drive?",
                new String[]{
                        "Yes.",
                        "No it is only needed on long trips.",
                        "No, being licensed is enough.",
                        "0"});

        generalList.add("Bicycle and motorcycle riders have the same rights to use the road as other motor vehicle\n" +
                "drivers. They are, however, more at risk in traffic because?");
        answerListForGeneralKnowled.put("Bicycle and motorcycle riders have the same rights to use the road as other motor vehicle\n" +
                        "drivers. They are, however, more at risk in traffic because?",
                new String[]{
                        "They are harder to see in traffic and do not have the same protection as\n" +
                                "many drivers.",
                        "They are careless and do not obey road rules.",
                        "They ride too fast and do not turn their lights on.",
                        "0"});

        generalList.add("To drive safely, you need to concentrate and be able to monitor everything that is\n" +
                "happening on the road. To do this, you need to?");
        answerListForGeneralKnowled.put("To drive safely, you need to concentrate and be able to monitor everything that is\n" +
                        "happening on the road. To do this, you need to?",
                new String[]{
                        "Continually scan the road, looking ahead, to the sides, checking side\n" +
                                "and rear mirrors and anticipate what may happen.",
                        "Turn all your attention only to the road ahead.",
                        "Ask other occupants in the vehicle to watch out for possible dangers.",
                        "0"});

        generalList.add("If you are driving towards a road works zone and a traffic controller displays a stop sign\n" +
                "you must?");
        answerListForGeneralKnowled.put("If you are driving towards a road works zone and a traffic controller displays a stop sign\n" +
                        "you must?",
                new String[]{
                        "Stop your vehicle and follow the directions of the traffic controller.",
                        "Stop and then proceed if you think it is safe.",
                        "Slow down and continue through the road works zone.",
                        "0"});

        generalList.add("If you are driving through a road work zone in the left\n" +
                "hand lane and you see this sign you should?");
        answerListForGeneralKnowled.put("If you are driving through a road work zone in the left\n" +
                        "hand lane and you see this sign you should?",
                new String[]{
                        "Merge to the right and give way to other\n" +
                                "traffic..",
                        "Speed up to get in front of any cars traveling in\n" +
                                "the right hand lane.",
                        "Stop and wait for directions.",
                        "0"});

        generalList.add("Where must L or P plates be displayed on a vehicle?");
        answerListForGeneralKnowled.put("Where must L or P plates be displayed on a vehicle?",
                new String[]{
                        "On the front and back of the exterior of the vehicle.",
                        "Anywhere including on the dashboard.",
                        "Anywhere inside the windows but only if they are not tinted.",
                        "0"});

        generalList.add("When displaying L or P plates, how much of the letter must be clearly visible?");
        answerListForGeneralKnowled.put("When displaying L or P plates, how much of the letter must be clearly visible?",
                new String[]{
                        "All of the letter L or P.",
                        "Only enough of the letter so it is clear whether it is an L or P.",
                        "Most of the letter.",
                        "0"});

        generalList.add("Do bicycle riders have the same rights and responsibilities as drivers and motorcycle\n" +
                "riders?");
        answerListForGeneralKnowled.put("Do bicycle riders have the same rights and responsibilities as drivers and motorcycle\n" +
                        "riders?",
                new String[]{
                        "Yes.",
                        "No, they must always ride on the footpath.",
                        "No, they must give way to cars at all times when riding on the road.",
                        "0"});

        generalList.add("Before getting out of your vehicle you must?");
        answerListForGeneralKnowled.put("Do bicycle riders have the same rights and responsibilities as drivers and motorcycle\n" +
                        "riders?",
                new String[]{
                        "Check your mirrors and blind spots for pedestrians, bicycles or other\n" +
                                "vehicles.",
                        "Check your seatbelt is back in place.",
                        "Check your headlights are turned off.",
                        "0"});
    }

    public static void initilizationTrafficSignsSection() {

        trafficSignsSection = new ArrayList<>();
        answerListforTrafficSignsSections = new HashMap<>();

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si001"});
        answerListforTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Not drive beyond the sign.",
                        "Drive with caution.",
                        "Not pass another vehicle.",
                        "0"});

        trafficSignsSection.add(new String[]{"This sign means you should?", "si002"});
        answerListforTrafficSignsSections.put("This sign means you should?",
                new String[]{
                        "Pass to the left of the sign.",
                        "Turn left at next street.",
                        "Drive carefully, roundabout ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si003"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "All right lane traffic must turn right at the next intersection.",
                        "Right lane traffic may turn right or go straight ahead at the\n" +
                                "next intersection.",
                        "One way traffic ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si004"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Traffic travels in each direction.",
                        "No turns permitted.",
                        "Double lane bridge ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si006 "});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You must not turn to the right.",
                        "You may turn to the right.",
                        "You must give way to traffic on your right.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si007"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You must not turn to the left.",
                        "You must not turn to the left or the right.",
                        "You must not turn to the right.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si008"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "All traffic must travel in the direction of the arrow.",
                        "Follow the arrow unless you are turning right.",
                        "Road curves to the left ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si009"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You may travel only in the direction in which the arrow is pointing.",
                        "No left turn.",
                        "One lane bridge ahead, slow down.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si013"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You are not to exceed 60 km/h.",
                        "You can go faster than 60 km/h.",
                        "You are on Highway 60.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si014"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You must not drive faster than 100 km/h.",
                        "You must drive faster than 100 km/h.",
                        "The sign applies to truck drivers only, cars can travel at any speed.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si016"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Drive carefully, and watch out for kangaroos\n" +
                                "entering the road for the next 30 km.",
                        "Zoo 30 km ahead.",
                        "Nature reserve 30 km ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si017"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "T-intersection ahead. If you are on the\n" +
                                "terminating road, you must give way to all\n" +
                                "vehicles approaching from your right or left.",
                        "No through road ahead, slow down.",
                        "Tollway ahead, be prepared to stop and pay toll.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you?", "si018"});
        answerListforTrafficSignsSections.put("When you see this sign you?",
                new String[]{
                        "Must not stop your vehicle at the kerb during the\n" +
                                "times shown.",
                        "Must not stop here at any time.",
                        "May stop at any time to pick up or drop off passengers.",
                        "0"});

        trafficSignsSection.add(new String[]{"You are most likely to find this sign?", "si019"});
        answerListforTrafficSignsSections.put("You are most likely to find this sign?",
                new String[]{
                        "On the approach to a bridge which has room for\n" +
                                "only two vehicles, slow down and proceed with\n" +
                                "caution.",
                        "When a bridge is not safe to drive on.",
                        "If there is a footbridge for pedestrians ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si020"});
        answerListforTrafficSignsSections.put("What does this sign mean??",
                new String[]{
                        "Road may be slippery when wet, slow down and\n" +
                                "drive carefully.",
                        "Sharp turns in the road ahead.",
                        "Road under repair, drive carefully.",
                        "0"});

        trafficSignsSection.add(new String[]{"You are most likely to find this sign?", "si021"});
        answerListforTrafficSignsSections.put("You are most likely to find this sign?",
                new String[]{
                        "As you approach a winding road, slow down and\n" +
                                "drive with caution.",
                        "If there is a steep hill ahead.",
                        "If an unsealed road is ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si022"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "A sharp depression in the road is ahead, be\n" +
                                "prepared, slow down.",
                        "Do not drive with your lights on high beam.",
                        "Police station ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si024"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Sharp bend to the right ahead, slow down and\n" +
                                "drive carefully.",
                        "Turn around and go back, you are going the wrong way.",
                        "No right turn allowed.",
                        "0"});

        trafficSignsSection.add(new String[]{"You are most likely to find this sign, where?", "si025"});
        answerListforTrafficSignsSections.put("You are most likely to find this sign, where?",
                new String[]{
                        "Children may be crossing the road ahead, slow\n" +
                                "down and be prepared to make a safe stop.",
                        "There is an athletic field ahead.",
                        "Pedestrians are not allowed.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si026"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Crossroads ahead, reduce your speed and watch\n" +
                                "out for other traffic and pedestrians.",
                        "Hospital ahead, drive carefully.",
                        "Cemetery ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"If the red lights on this sign are flashing what are" +
                " you required to do?", "si027"});
        answerListforTrafficSignsSections.put("If the red lights on this sign are flashing what are you required\n" +
                        "to do?",
                new String[]{
                        "Stop until red lights stop flashing then drive on if\n" +
                                "it is safe to do so.",
                        "Slow down and drive carefully over the crossing if you\n" +
                                "cannot see a train approaching.",
                        "Stop until train has passed then proceed immediately.",
                        "0"});

        trafficSignsSection.add(new String[]{"You should expect this sign, if?", "si028"});
        answerListforTrafficSignsSections.put("You should expect this sign, if?",
                new String[]{
                        "A give way sign at an intersection is ahead, slow\n" +
                                "down and be prepared to stop.",
                        "You are approaching a school or playground.",
                        "You are approaching an intersection with traffic lights, be\n" +
                                "prepared to stop.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si030"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down and beware of trucks entering from\n" +
                                "the side.",
                        "Trucks must use low gear.",
                        "Heavy vehicle checking station ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si031"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down and look out for pedestrians crossing\n" +
                                "the road ahead.",
                        "Stop and help aged pedestrians across the road.",
                        "Hospital ahead, slow down and proceed with caution.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si032"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Pedestrian crossing ahead, slow down and be\n" +
                                "prepared to stop.",
                        "Overhead footbridge for pedestrians ahead.",
                        "Joggers ahead, drive carefully.",
                        "0"});

        trafficSignsSection.add(new String[]{"You should expect this sign?", "si033"});
        answerListforTrafficSignsSections.put("You should expect this sign?",
                new String[]{
                        "When a divided road ends and two way traffic is\n" +
                                "ahead.",
                        "If a one way street is ahead.",
                        "If a one lane bridge is ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si035"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Workers ahead, slow down and be prepared to\n" +
                                "stop.",
                        "Children's playground ahead, slow down and be prepared\n" +
                                "to stop.",
                        "Do not litter. ",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si036"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Watch out for bicycle riders along the roadway or\n" +
                                "when turning.",
                        "Bicycle riders not allowed on the roadway.",
                        "You are approaching a children's playground, slow down.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si038"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "If traffic lights are out of order or the amber light\n" +
                                "is flashing, you must stop and give way to traffic\n" +
                                "as if you are at an intersection with stop signs.",
                        "Stop, red light camera in operation.",
                        "Stop at all times and give way to all traffic.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si039"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Stop sign ahead, slow down and prepare to stop.",
                        "You are approaching a roundabout, prepare to give way.",
                        "One way traffic ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si040"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Traffic controller ahead, slow down and be\n" +
                                "prepared to stop.",
                        "School children crossing the road ahead, prepare to stop.",
                        "Traffic lights out of order, Police on duty ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si041"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Steep down-grade in the road ahead, slow down.",
                        "Road ahead slippery when wet, drive carefully.",
                        "Road under repair, slow down.",
                        "0"});

        trafficSignsSection.add(new String[]{"You should expect this sign, when?", "si042"});
        answerListforTrafficSignsSections.put("You should expect this sign, when?",
                new String[]{
                        "A divided road is ahead, prepare for a change in\n" +
                                "traffic conditions.",
                        "A two lane bridge is ahead, slow down and drive carefully.",
                        "Freeway conditions are ahead, maximum speed is 100\n" +
                                "km/h.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si043"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Railway level crossing with flashing signals\n" +
                                "ahead, slow down, drive carefully, and be\n" +
                                "prepared to stop.",
                        "Intersection ahead with traffic lights, prepare to stop.",
                        "Red light camera in use at traffic lights ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si045"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Road narrows ahead, slow down and prepare for\n" +
                                "a change in traffic conditions.",
                        "Form one lane of traffic.",
                        "Merging traffic, give way to your right.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si046"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Vehicles are not allowed to stop at the kerb\n" +
                                "except in a medical emergency.",
                        "Vehicles must not stop at the kerb, except if picking up a\n" +
                                "passenger.",
                        "Vehicles must not stop at the kerb, unless picking up\n" +
                                "goods.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si048"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Vehicles carrying three or more people, and\n" +
                                "motorcycles may use this lane.",
                        "Motor cars carrying one passenger may use this lane.",
                        "This lane is reserved for bicycle riders only.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si049"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Railway level crossing ahead, slow down and\n" +
                                "look out for trains, be prepared to stop.",
                        "Cattle or sheep crossing the road ahead, drive slowly.",
                        "Give way sign ahead, slow down and be prepared to stop.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign, you should?", "si050"});
        answerListforTrafficSignsSections.put("When you see this sign, you should?",
                new String[]{
                        "Drive carefully and watch out for traffic entering\n" +
                                "from a side-road intersection ahead.",
                        "Take care, trucks crossing the road ahead.",
                        "Take a break, rest area ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you must?", "si051"});
        answerListforTrafficSignsSections.put("When you see this sign you must?",
                new String[]{
                        "Stop at the stop line and give way to all traffic.",
                        "Stop at the stop line and give way to all traffic on your right\n" +
                                "only.",
                        "Slow down and be prepared to stop only if there is any\n" +
                                "danger of a collision with another vehicle or pedestrian.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you must?", "si052"});
        answerListforTrafficSignsSections.put("When you see this sign you must?",
                new String[]{
                        "Slow down and be prepared to stop and give way to\n" +
                                "all traffic if there is any danger of a collision.",
                        "Stop and give way to all traffic even if the intersection is clear.",
                        "Slow down and be prepared to give way to traffic on your\n" +
                                "right only, if there is any danger of a collision.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si053"});
        answerListforTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Come to a complete stop, look both ways for trains\n" +
                                "and proceed with caution if no trains are approaching.",
                        "Slow down, then drive slowly over the crossing looking both\n" +
                                "ways for trains.",
                        "Stop, only if a train is at the crossing.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si056"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down, the maximum safe speed around the\n" +
                                "next curve in the road is 35km/h.",
                        "Winding road ahead for next 35 km.",
                        "Next main town 35 km to the right.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si057"});
        answerListforTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Slow down and be prepared to stop if the lights\n" +
                                "start flashing, warning you of an approaching train.",
                        "Continue at the same speed and not look both ways for\n" +
                                "approaching trains.",
                        "Stop in the middle of the railway tracks and look both ways\n" +
                                "for approaching trains",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign means?", "si058"});
        answerListforTrafficSignsSections.put("What does this sign means?",
                new String[]{
                        "You must stay in or move to the left lane, unless you are\n" +
                                "overtaking another vehicle.",
                        "You must stay in the left lane and must not overtake any vehicles.",
                        "You can overtake vehicles only on the left side.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign, what must you do?", "si059"});
        answerListforTrafficSignsSections.put("When you see this sign, what must you do?",
                new String[]{
                        "Slow down and be ready to stop and give way to a train.",
                        "Stop before the railway crossing, wait for 1 minute and proceed if the\n" +
                                "crossing is clear.",
                        "Drive quickly over the railway crossing.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si060"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down, be ready to stop and give way to all vehicles\n" +
                                "already on the roundabout if there is a danger of a\n" +
                                "collision.",
                        "All traffic must turn back at the roundabout.",
                        "Stop at all times and give way to all traffic on your right.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si061"});
        answerListforTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Drive carefully, you are reaching the top of the hill and\n" +
                                "will not be able to see a safe distance in front of you.",
                        "Watch out, the road ahead may be flooded.",
                        "Slow down, there is a dangerous curve ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si062"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "There is a hump (sudden slope up and down) in the road\n" +
                                "ahead, slow down.",
                        "There is a tunnel ahead, turn on your headlights.",
                        "The road ahead is closed, go back.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign tell you?", "si063"});
        answerListforTrafficSignsSections.put("What does this sign tell you?",
                new String[]{
                        "There may be animals on or near the road ahead,\n" +
                                "slow down and be prepared to stop to avoid collision.",
                        "Animals are crossing the road ahead, stop and wait for\n" +
                                "directions.",
                        "You are approaching an animal farm.    ",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si064"});
        answerListforTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Only vehicles carrying a disable person and\n" +
                                "displaying a mobility parking authority may park in\n" +
                                "this area.",
                        "Motorcyclists may park in this area.",
                        "Vehicles may park in this area for up to ten minutes.",
                        "0"});


    }
}
