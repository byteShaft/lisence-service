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
                        "You will never be allowed to take another test.", "Nothing, there is no penalty.",
                        "0"
                });

        ICAC.add("What will happen if you offer a testing officer a bribe to pass your driving test?");
        answerList.put("What will happen if you offer a testing officer a bribe to pass your driving test?",
                new String[]{"Action will be taken against you. The penalties are severe and " +
                        "include fines and imprisonment.", "Only the testing officer will be investigated.",
                        "Nothing, there is no penalty.", "0"});

        ICAC.add("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to " +
                "him or her?");
        answerList.put("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to " +
                        "him or her?",
                new String[]{"Only the testing officer will be investigated.",
                        "Action will be taken against you. The penalties are severe and  " +
                                "include fines and imprisonment.",
                        "Nothing, there is no penalty.", "1"});


    }

    public static void initializeGeneralKnowledge() {

        generalList = new ArrayList<>();
        answerList = new HashMap<>();
        generalList.add("Can a P1 or P2 provisional driver legally instruct a learner driver?");
        answerList.put("Can a P1 or P2 provisional driver legally instruct a learner driver?",
                new String[]{"Yes, provided the provisional driver has held a P2 licence for more than 6 months.",
                        "No.",
                        "Yes, provided L and P1 or P2 plates are displayed.", "1"});

        generalList.add("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence " +
                "for a minimum period of?");
        answerList.put("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence " +
                        "for a minimum period of?",
                new String[]{"24 months.", "12 months.", "18 months.", "1"});

        generalList.add("If one or two of your wheels run off the edge of the roadway, you should?");
        answerList.put("If one or two of your wheels run off the edge of the roadway, you should?",
                new String[]{"Slow down gradually and ease back onto the road.",
                        "Slow down quickly by braking hard.",
                        "Increase your speed and drive back on the road.", "0"});

        generalList.add("If there are no lanes marked on the road, you should drive?");
        answerList.put("If there are no lanes marked on the road, you should drive?",
                new String[]{"Anywhere on your side of the road.",
                        "Along the middle of the road.",
                        "Near to the left-hand side of the road.", "2"});

        generalList.add("If you intend to turn left, are you required to give a signal?");
        answerList.put("If you intend to turn left, are you required to give a signal?",
                new String[]{"Yes, if turn signals are fitted to your vehicle.",
                        "No, if turning left from a lane marked left turn only.",
                        "No, if arrows are marked on the roadway.", "0"});

        generalList.add("What is meant by this sign on or near a bridge?");
        answerList.put("What is meant by this sign on or near a bridge?",
                new String[]{"Stop at all times before crossing the bridge and only give " +
                        "way to pedestrians who may be crossing.",
                        "Slow down and be prepared to give way to " +
                                "vehicles travelling in the opposite direction.",
                        "Do not overtake a vehicle travelling in the same direction.", "1"});

        generalList.add("When reversing, you should?");
        answerList.put("When reversing, you should?",
                new String[]{"Unbuckle your seat belt so you can reverse as quickly " +
                        "as possible.",
                        "Take care and never reverse for a greater " +
                                "distance and time than is necessary.",
                        "Sound your horn to warn other drivers.", "1"});

        generalList.add("How close can you park to another vehicle when parked parallel to the kerb?");
        answerList.put("How close can you park to another vehicle when parked parallel to the kerb?",
                new String[]{"You must leave at least 1 metre front and back.",
                        "You must leave at least 2 metres from the front only.",
                        "You must leave at least 3 metres front and back.", "0"});

        generalList.add("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked " +
                "vehicle?");
        answerList.put("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked " +
                        "vehicle?",
                new String[]{"Yes, if not obstructing traffic.",
                        "Yes, if delivering goods.",
                        "No, not at any time.", "2"});

        generalList.add("Do you have any responsibilities when opening a vehicle door on a roadway?");
        answerList.put("Do you have any responsibilities when opening a vehicle door on a roadway?",
                new String[]{"Yes, you must not open a door if you are likely to cause danger to " +
                        "road users or impede traffic.",
                        "No, any following traffic must stop if the door interferes with its progress.",
                        "No, there is no regulation to cover this situation.", "0"});

        generalList.add("Are you permitted to park on a median strip or traffic island?");
        answerList.put("Are you permitted to park on a median strip or traffic island?",
                new String[]{"No, not at any time.",
                        "Yes, in daylight hours.",
                        "Yes, but for no more than 30 minutes.", "0"});

        generalList.add("Are you permitted to park in the direction of the arrow?");
        answerList.put("Are you permitted to park in the direction of the arrow?",
                new String[]{"Yes, if you are carrying two or more passengers.",
                        "Yes, provided no taxis are using the area.",
                        "No, not at any time.", "2"});

        generalList.add("When driving at sunset or dawn on a dark day, what should you do?");
        answerList.put("When driving at sunset or dawn on a dark day, what should you do?",
                new String[]{"Turn on your lights on low beam.",
                        "Keep your sunglasses on to cut down headlight glare.",
                        "Turn on your hazard warning lights.", "0"});

        generalList.add("You are driving at night with your headlights on high beam. When should you dip your headlights?");
        answerList.put("You are driving at night with your headlights on high beam. When should you dip your headlights?",
                new String[]{"Never, you are allowed to drive with your lights on high beam at all times.",
                        "When within 200 metres of an oncoming vehicle only.",
                        "When within 200 metres of the vehicle ahead or an oncoming one.", "2"});

        generalList.add("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus " +
                "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you " +
                "should?");
        answerList.put("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus " +
                        "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you " +
                        "should?",
                new String[]{"Slow down, and give way to the bus as it has " +
                        "priority.",
                        "Sound your horn to stop the bus from pulling out.",
                        "Continue at your normal speed as the bus does not have " +
                                "priority.", "0"});

        generalList.add("Is it an offence to obstruct clear vision of your number plates?");
        answerList.put("Is it an offence to obstruct clear vision of your number plates?",
                new String[]{
                        "Yes, at any time.",
                        "Yes, but it is legal for a towbar or bicycle rack to cover the rear number plate.",
                        "No, you are allowed to cover your number plates if you want to.",
                        "0"});

        generalList.add("Before driving on a freeway, which of the following should you do?");
        answerList.put("Before driving on a freeway, which of the following should you do?",
                new String[]{
                        "Make sure your vehicle has enough fuel, oil, water and the correct tyre pressure.",
                        "Take your street directory in case you get lost.",
                        "Take something to calm your nerves before driving.",
                        "0"});

        generalList.add("What must you do if you miss your exit on a freeway?");
        answerList.put("What must you do if you miss your exit on a freeway?", new String[]{
                "Continue until you reach the next appropriate exit.",
                "Stop, and reverse back along the freeway to the exit you missed.",
                "Stop immediately and turn around.", "0"});


        generalList.add("As you leave a freeway, which of the following should you check?");
        answerList.put("As you leave a freeway, which of the following should you check?",
                new String[]{
                        "Your speed.",
                        "Fuel gauge.",
                        "Windscreen wipers.",
                        "0"});


        generalList.add("When can a private car travel in a lane marked by this sign?");
        answerList.put("When can a private car travel in a lane marked by this sign?",
                new String[]{
                        "Only to overtake another vehicle.",
                        "When carrying at least two passengers.",
                        "Only within 100 metres of making a turn.",
                        "2"});

        generalList.add("Are you permitted to drive a car towing more than one trailer?");
        answerList.put("Are you permitted to drive a car towing more than one trailer?",
                new String[]{
                        "No, not at all.",
                        "Yes, if the combined length of vehicle and trailers does not exceed 15 metres.",
                        "Yes, provided you have held a licence for two years.",
                        "0"});

        generalList.add("What must you do when you are towing a caravan to help other vehicles overtake?");
        answerList.put("What must you do when you are towing a caravan to help other vehicles overtake?",
                new String[]{
                        "Drive at least 25 km/h below the speed limit.",
                        "Keep at least 60 metres behind heavy vehicles or other vehicles towing caravans.",
                        "Stop immediately and let the faster vehicle overtake.",
                        "1"});

        generalList.add("Are you permitted to tow a caravan with a person riding in the caravan?");
        answerList.put("Are you permitted to tow a caravan with a person riding in the caravan?",
                new String[]{
                        "Yes, provided you do not exceed 60 km/h.",
                        "Yes, if the person(s) in the caravan are over 12 years of age.",
                        "No, not under any circumstances.",
                        "2"});

        generalList.add("Before driving a long distance at fast speed or carrying a full car load, you should -");
        answerList.put("Before driving a long distance at fast speed or carrying a full car load, you should -",
                new String[]{
                        "Check your tyre pressure, and if necessary, increase it to what the manufacturer recommends.",
                        "Make sure you have a street directory, so you know where you are going.",
                        "Have a large meal and a cup of coffee.",
                        "0"});

        generalList.add("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -");
        answerList.put("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -",
                new String[]{
                        "Brake, look for room to the left, sound your horn and flash your lights.",
                        "Slow down and hope that the driver will turn away.",
                        "Drive onto the wrong side of the road and hope the other vehicle does not do the same.",
                        "0"});

        generalList.add("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -");
        answerList.put("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -",
                new String[]{
                        "Do not need to report the accident to the Police.",
                        "Must report the accident to the Police Station nearest to where the accident happened within 24 hours.",
                        "Only need to report the accident to the Police if someone was injured.",
                        "1"});

        generalList.add("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?");
        answerList.put("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?",
                new String[]{
                        "You must let them see your licence, take details, and give the name and address of the vehicle's owner.",
                        "No details at all until you have contacted your insurance company.",
                        "Only your name and address details if a Policeman asks for them.",
                        "0"});

        generalList.add("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?");
        answerList.put("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?",
                new String[]{
                        "Render every assistance and take immediate steps to have an ambulance notified. Then call the Police.\n",
                        "Only call the Police if the accident also resulted in over $500 worth of property damage.",
                        "Report the accident to Police within seven days.",
                        "0"});

        generalList.add("Stop signs or flashing lights at railway crossings should always be obeyed, because -");
        answerList.put("Stop signs or flashing lights at railway crossings should always be obeyed, because -",
                new String[]{
                        "Trains are fast, heavy and cannot stop quickly.",
                        "Pedestrians might be crossing.",
                        "Car brakes often fail.",
                        "0"});

        generalList.add("You should not drive across a railway level crossing when -");
        answerList.put("You should not drive across a railway level crossing when -",
                new String[]{
                        "Traffic is blocking the other side.",
                        "You are towing a caravan.",
                        "A station is nearby.",
                        "0"});

        generalList.add("You should use your right-hand indicator when -");
        answerList.put("You should use your right-hand indicator when -",
                new String[]{
                        "You are about to stop.",
                        "You intend to move to the right, at any time.",
                        "You intend to slow down.",
                        "1"});

        generalList.add("When merging onto the freeway from the entrance, you should -");
        answerList.put("When merging onto the freeway from the entrance, you should -",
                new String[]{
                        "Look for a large enough break in the traffic and adjust your speed so as to fit into the traffic flow.",
                        "Sound your horn, turn on your indicator lights and move onto the freeway.",
                        "Stop and check the traffic behind you on the entrance.",
                        "0"});

        generalList.add("If you see a sign indicating road repairs are going on, you should -");
        answerList.put("If you see a sign indicating road repairs are going on, you should -",
                new String[]{
                        "Maintain the same speed.",
                        "Stop immediately and wait for instructions.",
                        "Slow down and watch for traffic controllers and instructions.",
                        "2"});

        generalList.add("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?");
        answerList.put("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?",
                new String[]{
                        "Clearway restrictions apply - you must not stop during the clearway hours.",
                        "You may at any time, park along this part of the road for 1 hour only.",
                        "Bicycle riders must ride along the yellow line.",
                        "0"});

        generalList.add("If you see a horse and rider on the road what should you do?");
        answerList.put("If you see a horse and rider on the road what should you do?",
                new String[]{
                        "Slow down and give them plenty of room.",
                        "Sound your horn to warn the rider.",
                        "Speed up to pass the horse.",
                        "0"});

        generalList.add("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                "drive this type of vehicle?");
        answerList.put("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                        "drive this type of vehicle?",
                new String[]{"A heavy rigid vehicle licence."
                        , "A car licence."
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
                "the inspection. What should you do?", new String[]{"You have seven days to have the car repaired, after which the RTA considers it to " +
                "be unregistered.", "After today you must not drive the car until it has been repaired, " +
                "passed another inspection and registered.", "Go to the RTA and ask them to renew your registration and tell them you will soon " +
                "get the car fixed.", "1"});
        generalList.add("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?");
        answerList.put("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?", new String[]{
                "Yes, but you must get the puncture fixed within 24 hours.", "Yes, if the tyre is correctly inflated and the side walls of the tyre are in good " +
                "condition.", "No, it's illegal to drive a car with a smooth tyre even if it is the spare.", "2"});
        generalList.add("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?");
        answerList.put("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?", new String[]{
                "Put up with the discomfort; you should not adjust another person's seat.",
                "Adjust the seat forward so it's right for you.", "Ask your friend for a cushion to place behind your back.", "1"});
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
                "Can you do a U-turn on this road?", new String[]{"Yes, any time.", "Yes, providing you use the gravel joining roads.",
                "No, not at any time.", "2"});
        generalList.add("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -");
        answerList.put("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -", new String[]{"Take the child with you.", "Leave the child in the car.",
                "Ask an older person sitting nearby to watch the child.", "0"});
        generalList.add("You want to leave your automatic car parked on a street sloping uphill. You should -");
        answerList.put("You want to leave your automatic car parked on a street sloping uphill. You should -",
                new String[]{"Park only on flat areas.", "Turn the wheels away from the kerb.",
                        "Put the handbrake on and put the " +
                                "transmission in \"P\" (park).", "2"});
        generalList.add("You have just passed this sign. Can you park on this road?");
        answerList.put("You have just passed this sign. Can you park on this road?", new String[]{
                "No, not at any time.", "Yes.", "Yes, but only in daylight hours.", "0"});
        generalList.add("Where there are double dividing lines, you may park -");
        answerList.put("Where there are double dividing lines, you may park -", new String[]{
                "At least three metres from the dividing lines.", "At least two metres from the dividing lines.",
                "One metre from the dividing lines.", "0"});
        generalList.add("If there are no signs or markings to advise you, can you choose any of these methods of parking?");
        answerList.put("If there are no signs or markings to advise you, can you choose any of these methods of parking?",
                new String[]{"No, only N is correct.", "Yes. M, N and O are all legal.",
                        "Yes, N is best but M and O are quite legal.", "0"});
        generalList.add("You should angle park -");
        answerList.put("You should angle park -", new String[]{"Where the road is very wide."
                , "Where there are markings or a sign indicating angle park.", "Where there is plenty of room from the " +
                "centre line.", "1"});
        generalList.add("This bridge has only just enough room for two vehicles. As you come close to it you should -");
        answerList.put("This bridge has only just enough room for two vehicles. As you come close to it you should -",
                new String[]{"Sound your horn to warn the other driver.", "Maintain your speed, keeping to the limit.",
                        "Slow down and pay extra attention.", "2"});
        generalList.add("Which side mirror is adjusted best?");
        answerList.put("Which side mirror is adjusted best?", new String[]{"Mirror B.", "Mirror A.", "Mirror C.", "1"});
        generalList.add("You should be particularly careful at this intersection because -");
        answerList.put("You should be particularly careful at this intersection because -",
                new String[]{"Intersections cause crashes.", "The building blocks a good view of the " +
                        "side street.", "It looks a bit tricky.", "1"});
        generalList.add("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                "pressures you to go around the bike and drive faster. How should you respond?");
        answerList.put("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                        "pressures you to go around the bike and drive faster. How should you respond?",
                new String[]{"Overtake the bike quickly and speed up to stop the other driver becoming " +
                        "aggressive.", "Go slower because the slower you go the safer you are.",
                        "Resist the pressure, stay calm and overtake the cyclist when it is " + "safe.",
                        "2"});
    }
}
