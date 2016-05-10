package com.byteshaft.licenseservice.utils;

import com.byteshaft.licenseservice.StartTestActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class Data {

    public static final String sICAC = "ICAC";
    public static final String sGeneralKnowledge = "General Knowledge";
    public static final String sTrafficSignsSection = "Traffic Signs Sections";
    public static final String sAlcholDrugs = "Alcohol and Drugs";
    public static final String sFatigueAndDefensiveDriving = "Fatigue and Defensive Driving";
    public static final String sIntersections = "Intersections";
    public static final String sNegligentDriving = "Negligent Driving";
    public static final String sPedestrians = "Pedestrians";
    public static final String sSeatBeltsRestraints = "Seat Belts / Restraints";
    public static final String sSpeedLimits = "Speed Limits";
    public static final String sTrafficLightsLanes = "Traffic Lights / Lanes";
    public static final String sTrafficLightsLanes2 = "Traffic Lights / Lanes-2";
    public static ArrayList<String[]> ICAC;
    public static ArrayList<String[]> generalList;
    public static ArrayList<String[]> trafficSignsSection;
    public static ArrayList<String[]> alcoholList;
    public static ArrayList<String[]> fatigue;
    public static ArrayList<String[]> intersection;
    public static ArrayList<String[]> negligentDriving;
    public static ArrayList<String[]> pedestrains;
    public static ArrayList<String[]> seatBelts;
    public static ArrayList<String[]> speedLimits;
    public static ArrayList<String[]> trafficLights;
    public static ArrayList<String[]> trafficLights2;

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
    public static HashMap<String, String[]> answerListForGeneralKnowledge;
    public static HashMap<String, String[]> answerListForICAC;
    public static HashMap<String, String[]> answerListForPedestrians;
    public static HashMap<String, String[]> answerListForTrafficSignsSections;
    public static HashMap<String, String[]> answerListForAlcoholAndDrug;
    public static HashMap<String, String[]> answerListForFatigueAndDefensiveDriving;
    public static HashMap<String, String[]> answerListForTrafficLights;
    public static HashMap<String, String[]> answerListForNegligentDriving;
    public static HashMap<String, String[]> answerListForSpeedLimits;
    public static HashMap<String, String[]> answerListForSeatBelt;
    public static HashMap<String, String[]> answerListForTrafficLights2;

    private static ArrayList<String> categories;
    private static HashMap<String, String[]> intersectionAnswers;

    public static ArrayList<String> initializeCategoriesArray() {
        categories = new ArrayList<>();
        categories.add(sICAC);
        categories.add(sGeneralKnowledge);
        categories.add(sTrafficSignsSection);
        categories.add(sAlcholDrugs);
        categories.add(sFatigueAndDefensiveDriving);
        categories.add(sIntersections);
        categories.add(sNegligentDriving);
        categories.add(sPedestrians);
        categories.add(sSeatBeltsRestraints);
        categories.add(sSpeedLimits);
        categories.add(sTrafficLightsLanes);
        categories.add(sTrafficLightsLanes2);
        return categories;
    }

    public static void getSelectedCategoryDetails(String category) {
        switch (category) {
            case sICAC:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeICAC();
                StartTestActivity.setValuesForCurrentCategory(ICAC, answerListForICAC);
                break;
            case sTrafficSignsSection:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializationTrafficSignsSection();
                StartTestActivity.setValuesForCurrentCategory(trafficSignsSection,
                        answerListForTrafficSignsSections);
                break;
            case sGeneralKnowledge:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeGeneralKnowledge();
                StartTestActivity.setValuesForCurrentCategory(generalList, answerListForGeneralKnowledge);
                break;
            case sAlcholDrugs:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeAlcoholAndDrugs();
                StartTestActivity.setValuesForCurrentCategory(alcoholList, answerListForAlcoholAndDrug);
                break;
            case sFatigueAndDefensiveDriving:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeFatigueAndDefensiveDriving();
                StartTestActivity.setValuesForCurrentCategory(fatigue, answerListForFatigueAndDefensiveDriving);
                break;
            case sIntersections:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeIntersection();
                StartTestActivity.setValuesForCurrentCategory(intersection, intersectionAnswers);
                break;
            case sTrafficLightsLanes:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeTraficLights();
                StartTestActivity.setValuesForCurrentCategory(trafficLights, answerListForTrafficLights);
                break;
            case sNegligentDriving:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeNegligentDriving();
                StartTestActivity.setValuesForCurrentCategory(negligentDriving, answerListForNegligentDriving);
                break;
            case sPedestrians:
                AppGlobals.sCurrentCategoryInitialized = true;
                initilizationPedestrians();
                StartTestActivity.setValuesForCurrentCategory(pedestrains, answerListForPedestrians);
                break;
            case sSeatBeltsRestraints:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeSeatBelts();
                StartTestActivity.setValuesForCurrentCategory(seatBelts, answerListForSeatBelt);
                break;
            case sSpeedLimits:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeSpeedlimits();
                StartTestActivity.setValuesForCurrentCategory(speedLimits, answerListForSpeedLimits);
                break;
            case sTrafficLightsLanes2:
                AppGlobals.sCurrentCategoryInitialized = true;
                initializeTrafficLightsTwo();
                StartTestActivity.setValuesForCurrentCategory(trafficLights2, answerListForTrafficLights2);
                break;
        }
    }

    public static void initializeTrafficLightsTwo() {
        trafficLights2 = new ArrayList<>();
        answerListForTrafficLights2 = new HashMap<>();

        trafficLights2.add(new String[]{"You are facing traffic lights (as shown). What do they mean?", "tl1"});
        answerListForTrafficLights2.put("You are facing traffic lights (as shown). What do they mean?",
                new String[]{
                        "You may proceed only in the direction of the green arrow.",
                        "You may proceed only in the direction of the green arrow when the red light has changed to green.",
                        "You must give way to oncoming traffic.",
                        "0"});

        trafficLights2.add(new String[]{"At traffic lights what is meant when a red light appears?", "tl2"});
        answerListForTrafficLights2.put("At traffic lights what is meant when a red light appears?",
                new String[]{
                        "Stop, make sure there is no traffic, then drive straight ahead",
                        "Stop, wait behind the stop line until the lights change to yellow.",
                        "Stop, wait behind the stop line until the lights change to green.",
                        "2"});

        trafficLights2.add(new String[]{"What should you do when approaching traffic lights which change from green to yellow?", "tl3"});
        answerListForTrafficLights2.put("What should you do when approaching traffic lights which change from green to yellow?",
                new String[]{
                        "Stop, only if a red light camera is in use.",
                        "Speed up to clear the intersection before the lights change to red.",
                        "Stop at the stop line unless you are so close that sudden or sharp braking might cause an accident.",
                        "2"});

        trafficLights2.add(new String[]{"What may you do at an intersection with traffic lights at which this sign is displayed?", "tl4"});
        answerListForTrafficLights2.put("What may you do at an intersection with traffic lights at which this sign is displayed?",
                new String[]{
                        "You should slow down and check if anyone is coming before turning left.",
                        "If the lights are red you must first stop, then you may turn left if it is safe to do so.",
                        "You may turn left only if a green arrow is shown.",
                        "1"});

        trafficLights2.add(new String[]{"Are you permitted to make a U-Turn at traffic lights?", ""});
        answerListForTrafficLights2.put("Are you permitted to make a U-Turn at traffic lights?",
                new String[]{
                        "No, unless there is a U-TURN PERMITTED sign at the intersection.",
                        "Yes, at all times.",
                        "Yes, if there is no danger of colliding with another vehicle.",
                        ""});

        trafficLights2.add(new String[]{"These lights mean that you -", "tl6"});
        answerListForTrafficLights2.put("These lights mean that you -",
                new String[]{
                        "Can turn left or go straight ahead.",
                        "Can turn left, but not go straight ahead.",
                        "Can turn left only if a sign 'TURN LEFT AT ANY TIME WITH CARE' is displayed.",
                        "1"});

        trafficLights2.add(new String[]{"This light means, you -", "tl7"});
        answerListForTrafficLights2.put("This light means, you -",
                new String[]{
                        "Can go straight ahead, or turn left or turn right, if it is safe to do so.",
                        "Must stop and wait for the red light before proceeding.",
                        "Can make a U turn provided it is safe to do so.",
                        "0"});

        trafficLights2.add(new String[]{"It is 3 o'clock in the morning. You cannot see any other traffic. You want to turn right. You may -", "tl8"});
        answerListForTrafficLights2.put("It is 3 o'clock in the morning. You cannot see any other traffic. You want to turn right. You may -",
                new String[]{
                        "Turn right if it is safe to do so.",
                        "Turn right when you have waited one minute.",
                        "Not turn right while the arrow is red.",
                        "2"});

        trafficLights2.add(new String[]{"As you approach an intersection with traffic lights, the yellow light turns to red. You must -", "tl10"});
        answerListForTrafficLights2.put("As you approach an intersection with traffic lights, the yellow light turns to red. You must -",
                new String[]{
                        "Stop and wait for the green light.",
                        "Speed up to avoid traffic from the left and right.",
                        "Sound your horn and proceed through the red light.",
                        "0"});

        trafficLights2.add(new String[]{"You approach an intersection showing a red light and the sign shown. You wish to turn left. You must -", "tl11"});
        answerListForTrafficLights2.put("You approach an intersection showing a red light and the sign shown. You wish to turn left. You must -",
                new String[]{
                        "Stop and turn left only if it is safe.",
                        "Stop and wait for a green light.",
                        "Slow down and turn left or right if it is safe.",
                        "0"});

        trafficLights2.add(new String[]{"It is early morning and there is no other traffic about. You approach an intersection when the traffic lights change from green to yellow. What should you do?", ""});
        answerListForTrafficLights2.put("It is early morning and there is no other traffic about. You approach an intersection when the traffic lights change from green to yellow. What should you do?",
                new String[]{
                        "Keep going.",
                        "Stop.",
                        "Drive through and sound your horn.",
                        "1"});

        trafficLights2.add(new String[]{"You are waiting at an intersection and the lights are red. The traffic lights change to green. You should -", "tl13"});
        answerListForTrafficLights2.put("You are waiting at an intersection and the lights are red. The traffic lights change to green. You should -",
                new String[]{
                        "Cross the intersection as quickly as possible.",
                        "Check both sides of the intersection and then proceed.",
                        "Wait until the traffic behind you makes you move.",
                        "1"});

        trafficLights2.add(new String[]{"You want to turn right at an intersection and see this traffic light. You should -", "tl14"});
        answerListForTrafficLights2.put("You want to turn right at an intersection and see this traffic light. You should -",
                new String[]{
                        "Stay behind the stop line until the green arrow shows.",
                        "Move forward slowly.",
                        "Enter the intersection and wait for the green arrow.",
                        "0"});

        trafficLights2.add(new String[]{"You wish to turn left at this intersection. The traffic lights are red and you see this sign. You should -", "tl15"});
        answerListForTrafficLights2.put("You wish to turn left at this intersection. The traffic lights are red and you see this sign. You should -",
                new String[]{
                        "Stop then go straight ahead.",
                        "Stop until the light turns green.",
                        "Stop, then if you see it is safe turn left.",
                        "2"});

        trafficLights2.add(new String[]{"You wish to turn left at this intersection and the traffic lights are green. What should you do?", "tl16"});
        answerListForTrafficLights2.put("You wish to turn left at this intersection and the traffic lights are green. What should you do?",
                new String[]{
                        "Wait behind the stop line until there is room for you to enter the new road.",
                        "Move forward slowly, make the left turn and wait behind car A.",
                        "Enter the intersection and sound the horn.",
                        "0"});

        trafficLights2.add(new String[]{"As you approach a set of traffic lights at an intersection, they change from green to yellow (amber). You must -", "tl17"});
        answerListForTrafficLights2.put("As you approach a set of traffic lights at an intersection, they change from green to yellow (amber). You must -",
                new String[]{
                        "Accelerate to clear the intersection before the lights change to red.",
                        "Stop before the lights, unless you are so close that sudden braking might cause an accident.",
                        "Drive through the intersection without accelerating.",
                        "1"});

        trafficLights2.add(new String[]{"Temporary traffic lights at road works -", "tl18"});
        answerListForTrafficLights2.put("Temporary traffic lights at road works -",
                new String[]{
                        "Apply to road works vehicles only.",
                        "Must be obeyed.",
                        "Are installed to warn motorists of construction works.",
                        "1"});

        trafficLights2.add(new String[]{"Where do you stop at temporary traffic lights?", "tl19"});
        answerListForTrafficLights2.put("Where do you stop at temporary traffic lights?",
                new String[]{
                        "At the ‘Stop here on red signal’ sign.",
                        "Where the lane ends.",
                        "After the traffic lights, but before the construction zone.",
                        "0"});
    }

    public static void initializeSeatBelts() {
        seatBelts = new ArrayList<>();
        answerListForSeatBelt = new HashMap<>();

        seatBelts.add(new String[]{"A car is carrying a driver and 3 adult passengers. There are seat belts in all seating positions. By law, seat belts must be worn by -", ""});
        answerListForSeatBelt.put("A car is carrying a driver and 3 adult passengers. There are seat belts in all seating positions. By law, seat belts must be worn by -",
                new String[]{
                        "All four people.",
                        "Only the driver.",
                        "Only the driver and front seat passenger.",
                        "0"});

        seatBelts.add(new String[]{"The adult passenger in the rear is breaking the law because she is -", "sb3"});
        answerListForSeatBelt.put("The adult passenger in the rear is breaking the law because she is -",
                new String[]{
                        "Distracting the driver.",
                        "Sitting in the back seat.",
                        "Not wearing the available seat belt.",
                        "2"});

        seatBelts.add(new String[]{"The most effective device for protecting passengers when in an accident is –", ""});
        answerListForSeatBelt.put("The most effective device for protecting passengers when in an accident is –",
                new String[]{
                        "Seat belts.",
                        "Safety door latches.",
                        "Padded instrument panels.",
                        "0"});

        seatBelts.add(new String[]{"Which one of the following statements is correct? Seat belts -", ""});
        answerListForSeatBelt.put("Which one of the following statements is correct? Seat belts -",
                new String[]{
                        "Save lives and prevent injury.",
                        "Do not have to be used in the rear seat.",
                        "Are not necessary for good drivers.",
                        "0"});

        seatBelts.add(new String[]{"Seat belts and child restraints (eg baby capsules and child seats) -", ""});
        answerListForSeatBelt.put("Seat belts and child restraints (eg baby capsules and child seats) -",
                new String[]{
                        "Are only needed on short trips.",
                        "Are only needed on long trips.",
                        "Must always be worn properly, and adjusted tightly.",
                        "2"});

        seatBelts.add(new String[]{"Child restraints (eg, baby capsules and child seats) -", ""});
        answerListForSeatBelt.put("Child restraints (eg, baby capsules and child seats) -",
                new String[]{
                        "Should be fitted according to the manufacturers' instructions.",
                        "Are not as safe as holding a child in your arms.",
                        "Need only be used if the child wants to sleep.",
                        "0"});

        seatBelts.add(new String[]{"You are driving a vehicle that only has a seat belt" +
                " for the driver. To reduce the danger of being in a vehicle without a seat " +
                "belt, where is the best place for passengers to sit?", ""});
        answerListForSeatBelt.put("You are driving a vehicle that only has a seat belt for " +
                        "the driver. To reduce the danger of being in a vehicle without a seat belt," +
                        " where is the best place for passengers to sit?",
                new String[]{
                        "In the front seat.",
                        "In the back seat.",
                        "In the front seat sharing your seat belt.",
                        "1"});

        seatBelts.add(new String[]{"When passengers get in the car and do not put their seat belts on, the safest thing to dois-", ""});
        answerListForSeatBelt.put("When passengers get in the car and do not put their seat belts on, the safest thing to dois-",
                new String[]{
                        "Tell them the car has seat belts and they should wear them.",
                        "Say nothing because it's the passengers' responsibility to wear their seat belts.",
                        "Drive slower than you normally would so the passengers are safe.",
                        "0"});

        seatBelts.add(new String[]{"You want to give a lift to a friend and his four month old baby. Before you do, you need to make sure -", ""});
        answerListForSeatBelt.put("You want to give a lift to a friend and his four month old baby. Before you do, you need to make sure -",
                new String[]{
                        "You have a baby restraint properly fitted to your vehicle.",
                        "You have enough seat belts for all the passengers, including the baby.",
                        "Your driver's licence permits you to carry children under the age of twelve months.",
                        "0"});

        seatBelts.add(new String[]{"You want to fit a baby restraint to your car. What should you secure the restraint to?", "sb19"});
        answerListForSeatBelt.put("You want to fit a baby restraint to your car. What should you secure the restraint to?",
                new String[]{
                        "Only at the back using the seat belt provided.",
                        "Any seat belt in the back or front of the car.",
                        "An anchorage point designed for a baby restraint.",
                        "2"});

        seatBelts.add(new String[]{"You give a friend and her 12 year old son a lift. Your friend" +
                " sits in the front and her son gets in the back. The boy does not put his seat " +
                "belt on. By law, who has to make sure the child wears his seat belt?", ""});
        answerListForSeatBelt.put("You give a friend and her 12 year old son a lift. " +
                        "Your friend sits in the front and her son gets in the back. The boy does not put" +
                        " his seat belt on. By law, who has to make sure the child wears his seat belt?",
                new String[]{
                        "The child does because it is always the passenger's responsibility.",
                        "Your friend does because she is the parent.",
                        "You do, because you are the driver.",
                        "2"});

        seatBelts.add(new String[]{"Which of the following statements is correct?", ""});
        answerListForSeatBelt.put("Which of the following statements is correct?",
                new String[]{
                        "By law, all occupants of a car (unless exempt) need to be restrained by a properly fitted and adjusted seat belt or a child restraint.",
                        "Occupants in a car fitted with airbags are not required to wear a seat belt.",
                        "Seat belts and child restraints are only required on short trips.",
                        "0"});
    }


    public static void initializeSpeedlimits() {

        speedLimits = new ArrayList<>();
        answerListForSpeedLimits = new HashMap<>();


        speedLimits.add(new String[]{"Driving faster than the maximum speed limit is -", ""});
        answerListForSpeedLimits.put("Driving faster than the maximum speed limit is -",
                new String[]{
                        "Never legally permitted.",
                        "Permitted only when passing another vehicle.",
                        "Only permitted when other vehicles are going faster than the speed limit.",
                        "0"});

        speedLimits.add(new String[]{"A Shared Traffic Zone, where pedestrians and other road users can share the road safely has a speed limit of -", ""});
        answerListForSpeedLimits.put("A Shared Traffic Zone, where pedestrians and other road users can share the road safely has a speed limit of -",
                new String[]{
                        "10 Km/h.",
                        "20 Km/h.",
                        "50 Km/h.",
                        "0"});

        speedLimits.add(new String[]{"You are driving in busy traffic in an 80 km/h zone. It begins to rain lightly. What should you do?", "sl21"});
        answerListForSpeedLimits.put("You are driving in busy traffic in an 80 km/h zone. It begins to rain lightly. What should you do?",
                new String[]{
                        "Pull over and wait till it stops raining.",
                        "Keep going at the same speed because that's how fast the signs tell you to drive.",
                        "Slow down to a speed that suits the conditions better.",
                        "2"});

        speedLimits.add(new String[]{"You are driving in a 70 km/h zone," +
                " keeping to the limit. Several vehicles pass you. One of your passengers " +
                "suggests you should keep up with the other traffic. What should you do?", "sl22"});
        answerListForSpeedLimits.put("You are driving in a 70 km/h zone, keeping to the limit." +
                        " Several vehicles pass you. One of your passengers suggests you" +
                        " should keep up with the other traffic. What should you do?",
                new String[]{
                        "Speed up to a little bit over the speed limit, because everyone does it.",
                        "Follow the suggestions and keep up with the traffic.",
                        "Decide your speed yourself, based on the speed limit and the conditions.",
                        "2"});

        speedLimits.add(new String[]{"You are driving in busy traffic in a 60 km/h zone. You feel 60 km/h is a bit too fast for the conditions. What should you do?", "sl23"});
        answerListForSpeedLimits.put("You are driving in busy traffic in a 60 km/h zone. You feel 60 km/h is a bit too fast for the conditions. What should you do?",
                new String[]{
                        "Slow down to a speed that suits the conditions.",
                        "Keep up with the other traffic because it's probably safe if the sign says 60 km/h.",
                        "Turn off the busy street and wait for traffic to clear.",
                        "0"});

        speedLimits.add(new String[]{"What could be the penalties for driving over the speed limit -", ""});
        answerListForSpeedLimits.put("What could be the penalties for driving over the speed limit -",
                new String[]{
                        "Fines, demerit points and possibly loss of licence.",
                        "Fines only.",
                        "A letter of warning and a small fine.",
                        "0"});

        speedLimits.add(new String[]{"Having a radar detector or jammer in your car is against the law -", ""});
        answerListForSpeedLimits.put("Having a radar detector or jammer in your car is against the law -",
                new String[]{
                        "No matter what your reason is.",
                        "Only if it is turned on.",
                        "If you purchased it after 1998.",
                        "0"});

        speedLimits.add(new String[]{"Where there are no speed limit signs, the speed limit is 100 km/h, unless -", ""});
        answerListForSpeedLimits.put("Where there are no speed limit signs, the speed limit is 100 km/h, unless -",
                new String[]{
                        "There are street lights along the road.",
                        "The road you are driving on is gravel.",
                        "There's an emergency, which mean speed limits don't apply.",
                        "0"});

        speedLimits.add(new String[]{"When you see this sign you must -", "sl30"});
        answerListForSpeedLimits.put("When you see this sign you must -",
                new String[]{
                        "Not exceed 40 km/h and keep a special lookout for bicycle riders, pedestrians and children.",
                        "Only enter the street if you live in the local zone.",
                        "Drive at a speed less than 40 km/h if you are not a resident of the local zone.",
                        "0"});

        speedLimits.add(new String[]{"This sign means you must -", "sl31"});
        answerListForSpeedLimits.put("This sign means you must -",
                new String[]{
                        "Share this road with other people and vehicles and not exceed 10 km/h.",
                        "Drive at 10 km/h if there are pedestrians around.",
                        "Reduce your speed to what you think is safe but never below 10 km/h",
                        "0"});

        speedLimits.add(new String[]{"It is 9.20am on a school day. You are driving at 60 km/h," +
                " the same speed as traffic around you. You pass this sign but the other " +
                "cars do not slow down much. What should you do?", "sl32"});
        answerListForSpeedLimits.put("It is 9.20am on a school day. You are driving at 60 km/h," +
                        " the same speed as traffic around you. You pass this sign but the other" +
                        " cars do not slow down much. What should you do?",
                new String[]{
                        "Slow down immediately to 40 km/h or less even though other drivers want to go faster.",
                        "Drive at the speed of the other drivers because it is safer to go with the flow of traffic than slow others up.",
                        "Stay at 60 km/h because it is nearly 9.30am and the times on the school sign are only advisory.",
                        "0"});

        speedLimits.add(new String[]{"Speed limit signs (such as the one shown) tell drivers -", "sl34"});
        answerListForSpeedLimits.put("Speed limit signs (such as the one shown) tell drivers -",
                new String[]{
                        "The maximum speed they are allowed to drive.",
                        "The minimum speed they are allowed to drive.",
                        "The recommended speed they are allowed to drive.",
                        "0"});

        speedLimits.add(new String[]{"If you are driving along the highway and come across road works with a reduced speed zone, you must -", ""});
        answerListForSpeedLimits.put("If you are driving along the highway and come across road works with a reduced speed zone, you must -",
                new String[]{
                        "Slow down to the new speed limit.",
                        "Drive through the road works zone as fast as you can to get past it.",
                        "Drive at the same speed as other vehicles.",
                        "0"});

    }

    public static void initializeNegligentDriving() {

        negligentDriving = new ArrayList<>();
        answerListForNegligentDriving = new HashMap<>();

        negligentDriving.add(new String[]{"When driving near parked vehicles, you should -", ""});
        answerListForNegligentDriving.put("When driving near parked vehicles, you should -",
                new String[]{
                        " Check for parked vehicles with turn signals on, or children about to step out.",
                        "Stop, if you see a car with its right-hand indicator on.",
                        "Sound your horn and flash your headlights to warn drivers not to pull out.",
                        "0"});

        negligentDriving.add(new String[]{"You are approaching a hill or curve. You must not cross the centre line to overtake -", ""});
        answerListForNegligentDriving.put("You are approaching a hill or curve. You must not cross the centre line to overtake -",
                new String[]{
                        "If you cannot see clear road ahead for 75 metres.",
                        "If you cannot see clear road ahead for 100 metres.",
                        "If you do not have a clear view of any approaching traffic.",
                        "2"});

        negligentDriving.add(new String[]{"You are approaching the crest (top of a hill) on a narrow road, the safest procedure is to -", ""});
        answerListForNegligentDriving.put("You are approaching the crest (top of a hill) on a narrow road, the safest procedure is to -",
                new String[]{
                        "Increase your speed and sound your horn.\n",
                        "Flash your headlights to warn oncoming traffic.",
                        "Keep to the left and slow down.",
                        "2"});

        // add images from here
        negligentDriving.add(new String[]{"On a single laned road (as shown), you must always overtake another vehicle on its right except when -", "nd7"});
        answerListForNegligentDriving.put("On a single laned road (as shown), you must always overtake another vehicle on its right except when -",
                new String[]{
                        "The other vehicle is turning right.",
                        "You are travelling at more than 80 km/h.",
                        "The other vehicle is going slower than you.",
                        "0"});

        negligentDriving.add(new String[]{"When overtaking another vehicle you should NOT move back in front of it, unless –", ""});
        answerListForNegligentDriving.put("When overtaking another vehicle you should NOT move back in front of it, unless –",
                new String[]{
                        "You can see the overtaken vehicle in your rear vision mirror.",
                        "An oncoming car appears over a hill.",
                        "The driver of the vehicle signals it is safe to do so.",
                        "0"});

        negligentDriving.add(new String[]{"A driver behind you signals their intention to overtake your car. What should you do?", ""});
        answerListForNegligentDriving.put("A driver behind you signals their intention to overtake your car. What should you do?",
                new String[]{
                        "Keep to the left and let that driver overtake you.",
                        "Speed up so that the driver will not have to overtake.",
                        "Signal the driver to remain behind you if it is travelling too fast.",
                        "0"});

        negligentDriving.add(new String[]{"The faster the vehicle in front of you is travelling, the -", ""});
        answerListForNegligentDriving.put("The faster the vehicle in front of you is travelling, the -",
                new String[]{
                        "More distance and time you need to overtake.",
                        "Less time you need to overtake.",
                        "Closer you must get before starting to overtake.",
                        "0"});

        negligentDriving.add(new String[]{"If you are not sure you have enough distance to overtake a vehicle ahead, you should -", ""});
        answerListForNegligentDriving.put("If you are not sure you have enough distance to overtake a vehicle ahead, you should -",
                new String[]{
                        "Put the vehicle in a lower gear and speed up.",
                        "Wait for a better opportunity with more distance to overtake.",
                        "Sound your horn to signal the driver ahead to slow down.",
                        "1"});

        negligentDriving.add(new String[]{"When being overtaken by another vehicle what should you do to help?", ""});
        answerListForNegligentDriving.put("When being overtaken by another vehicle what should you do to help?",
                new String[]{
                        "Keep left and allow plenty of room to let the other vehicle back in.",
                        "Brake quickly to let the other vehicle overtake.",
                        "Move to the left and stop.",
                        "0"});

        negligentDriving.add(new String[]{"Before beginning to overtake another vehicle, you should -", ""});
        answerListForNegligentDriving.put("Before beginning to overtake another vehicle, you should -",
                new String[]{
                        "Check to see it is safe, change gear if necessary, and signal your intention before moving out.",
                        "Signal and slow down so you will have more room to overtake.",
                        "Sound your horn, move out and overtake.",
                        "0"});

        negligentDriving.add(new String[]{"You are driving behind a long vehicle (as shown)" +
                " which has a sign saying DO NOT OVERTAKE TURNING VEHICLE. The long vehicle indicates that it is going to turn left. You –", "nd15"});
        answerListForNegligentDriving.put("",
                new String[]{
                        "Must let the long vehicle turn first.",
                        "May move to the left-hand side of the road and pass the long vehicle.",
                        "May pass the truck because it cannot turn left from the middle lane.",
                        ""});

        negligentDriving.add(new String[]{"How should you overtake a pedal cyclist?", "nd19"});
        answerListForNegligentDriving.put("How should you overtake a pedal cyclist?",
                new String[]{
                        "The same as you would another car, with safety.",
                        "Drive as close as possible to the cyclist so he or she will move over and let you pass.",
                        "Sound your horn to warn the cyclist to get off the road.",
                        "0"});

        negligentDriving.add(new String[]{"If an overtaking vehicle signals that it must move in, in front of you, you should -", "nd20"});
        answerListForNegligentDriving.put("If an overtaking vehicle signals that it must move in, in front of you, you should -",
                new String[]{
                        "Prepare to slow down to allow room.",
                        "Speed up and not let the vehicle back in.",
                        "Flash your lights at the overtaking vehicle.",
                        "0"});

        negligentDriving.add(new String[]{"The first thing you should do before overtaking is -", ""});
        answerListForNegligentDriving.put("The first thing you should do before overtaking is -",
                new String[]{
                        "Make sure it is safe and the way is clear of oncoming traffic.",
                        "Sound your horn.",
                        "Increase your speed.",
                        "0"});

        negligentDriving.add(new String[]{"If you are convicted of driving with a blood alcohol level that is over the limit for your licence, you could lose your driver’s licence. You may also -", ""});
        answerListForNegligentDriving.put("If you are convicted of driving with a blood alcohol level that is over the limit for your licence, you could lose your driver’s licence. You may also -",
                new String[]{
                        "Be sent to prison.",
                        "Be restricted to driving an automatic vehicle.",
                        " Have a personal speed limit imposed on you.",
                        "0"});

        negligentDriving.add(new String[]{"If you are convicted of dangerous driving -", ""});
        answerListForNegligentDriving.put("If you are convicted of dangerous driving -",
                new String[]{
                        "You could be given demerit points only.",
                        "You could only be fined and given demerit points.",
                        "You could lose your licence and may be sent to prison.",
                        "2"});

        negligentDriving.add(new String[]{"You are travelling in the left lane" +
                " and wish to turn right at the intersection. You move to the right lane and a" +
                " driver behind sounds their horn at you. What have you done wrong?", "nd31"});
        answerListForNegligentDriving.put("You are travelling in the left lane and wish to turn" +
                        " right at the intersection. You move to the right lane and " +
                        "a driver behind sounds their horn at you. What have you done wrong?",
                new String[]{
                        "Crossed an unbroken lane line.",
                        "Driven too slowly.",
                        "Changed lanes unnecessarily.",
                        "0"});

        negligentDriving.add(new String[]{"What is this driver doing that is negligent and illegal?", "nd32"});
        answerListForNegligentDriving.put("What is this driver doing that is negligent and illegal?",
                new String[]{
                        "Crossing an unbroken line at a curve.",
                        "Not signalling to change lanes.",
                        "Overtaking on the kerb side.",
                        "0"});

        negligentDriving.add(new String[]{"The speed limit on this road is 90 km/h. You have just overtaken a vehicle in the left lane. What should you do next?", "nd33"});
        answerListForNegligentDriving.put("The speed limit on this road is 90 km/h. You have just overtaken a vehicle in the left lane. What should you do next?",
                new String[]{
                        "Accelerate away from the other vehicle and keep driving in this lane.",
                        "Keep your position in this lane.",
                        "Move into the left lane.",
                        "2"});

        negligentDriving.add(new String[]{"The speed limit on this road is 100 km/h. When can you use the right lane?", "nd34"});
        answerListForNegligentDriving.put("The speed limit on this road is 100 km/h. When can you use the right lane?",
                new String[]{
                        "Only when overtaking or turning right.",
                        "Whenever you want to.",
                        "When there is no other traffic around.",
                        "0"});

        negligentDriving.add(new String[]{"Another vehicle is overtaking you on your right. You commit a traffic offence if you -", ""});
        answerListForNegligentDriving.put("Another vehicle is overtaking you on your right. You commit a traffic offence if you -",
                new String[]{
                        "Speed up while the other vehicle is on your right.",
                        "Keep the same speed.",
                        "Slow down while the other vehicle is on your right.",
                        "0"});

        negligentDriving.add(new String[]{"If the police suspect you may have been involved in street or drag racing, they may take immediate action. Which one of the following is correct? The police may -", ""});
        answerListForNegligentDriving.put("If the police suspect you may have been involved in street or drag racing, they may take immediate action. Which one of the following is correct? The police may -",
                new String[]{
                        "Take your vehicle from you and keep it stored for up to three months.",
                        "Take your vehicle to the local police station and keep it till the following morning.",
                        "Take your vehicle away and sell it at an auction.",
                        "0"});

        negligentDriving.add(new String[]{"If you are convicted a second time for street or drag racing, which one of the following penalties applies?", ""});
        answerListForNegligentDriving.put("If you are convicted a second time for street or drag racing, which one of the following penalties applies?",
                new String[]{
                        "Your vehicle may be taken away and sold.",
                        "You will have to pay for the storage of your vehicle.",
                        "You will not be able to register your vehicle again.",
                        "0"});

        negligentDriving.add(new String[]{"If you have been convicted for street or drag racing, which of these penalties may apply?", ""});
        answerListForNegligentDriving.put("If you have been convicted for street or drag racing, which of these penalties may apply?",
                new String[]{
                        "You will get three demerit points and a large fine.",
                        "You will be given a letter of warning and fined.",
                        "You will be fined a small amount and get one demerit point.",
                        "0"});

        negligentDriving.add(new String[]{"When you have started to overtake the car, you notice that its right indicator is flashing. You should -", "nd44"});
        answerListForNegligentDriving.put("When you have started to overtake the car, you notice that its right indicator is flashing. You should -",
                new String[]{
                        "Check your mirror and move back in behind the car.",
                        "Accelerate quickly to get past.",
                        "Immediately brake to a stop.",
                        "0"});

        negligentDriving.add(new String[]{"If you are caught speeding through a road work zone you will -", ""});
        answerListForNegligentDriving.put("If you are caught speeding through a road work zone you will -",
                new String[]{
                        "Be liable for a speeding fine and loss of demerit points.",
                        "Receive a warning letter in the mail.",
                        "Not receive any penalty as road works speed limits are only advisory.",
                        "0"});

        negligentDriving.add(new String[]{"When driving through temporary road work you should -", ""});
        answerListForNegligentDriving.put("When driving through temporary road work you should -",
                new String[]{
                        "Slow down and look out for hazards.",
                        "Maintain current speed if the road is clear.",
                        "Sound your horn.",
                        "0"});

        negligentDriving.add(new String[]{"When entering or leaving a driveway you must -", ""});
        answerListForNegligentDriving.put("When entering or leaving a driveway you must -",
                new String[]{
                        "Give way to bicycles, vehicles and pedestrians.",
                        "Stop and give way only to vehicles.",
                        "Blow your horn to warn other road users.",
                        "0"});

        negligentDriving.add(new String[]{"Will a P1 licence be suspended for any speeding offence?", ""});
        answerListForNegligentDriving.put("Will a P1 licence be suspended for any speeding offence?",
                new String[]{
                        "Yes.",
                        "No.",
                        "Only for 10 km/h or more over the speed limit.",
                        "0"});

    }

    public static void initializeTraficLights() {

        trafficLights = new ArrayList<>();
        answerListForTrafficLights = new HashMap<>();

        trafficLights.add(new String[]{"How should you merge with traffic when entering a freeway?", ""});
        answerListForTrafficLights.put("How should you merge with traffic when entering a freeway?",
                new String[]{
                        "Watch for a gap and merge with the traffic at the speed it is travelling.",
                        "Speed up and force your way into the traffic.",
                        "Stop, then enter the traffic quickly.",
                        "0"});

        trafficLights.add(new String[]{"Which movements shown in the diagram can legally be made by the driver of the purple car?", "ld2"});
        answerListForTrafficLights.put("Which movements shown in the diagram can legally be made by the driver of the purple car?",
                new String[]{
                        "O and P only.",
                        "P only.",
                        "O, P and Q.",
                        "0"});

        trafficLights.add(new String[]{"Which movements shown in the diagram can legally be made by the driver of the purple car?", "ld3"});
        answerListForTrafficLights.put("Which movements shown in the diagram can legally be made by the driver of the purple car?",
                new String[]{
                        "O, P and Q.",
                        "O and P only.",
                        "P only.",
                        "0"});

        trafficLights.add(new String[]{"Which movements shown in the diagram can legally be made by the driver of the purple car?", "ld4"});
        answerListForTrafficLights.put("Which movements shown in the diagram can legally be made by the driver of the purple car?",
                new String[]{
                        "O and P only.",
                        "P only.",
                        "O, P and Q.",
                        "0"});

        trafficLights.add(new String[]{"Double unbroken dividing lines are marked on a roadway. You may -", ""});
        answerListForTrafficLights.put("Double unbroken dividing lines are marked on a roadway. You may -",
                new String[]{
                        "Cross them to make a U turn.",
                        "Cross them to overtake a car ahead if it is safe to do so.",
                        "Cross them to turn into a driveway or property, if it is safe to do so.",
                        "2"});

        trafficLights.add(new String[]{"You are on an open country road with double" +
                " unbroken dividing lines. There are no side streets and no entrances" +
                " to properties. Are you allowed to cross the dividing lines?", ""});
        answerListForTrafficLights.put("You are on an open country road with double unbroken " +
                        "dividing lines. There are no side streets and no entrances to properties. " +
                        "Are you allowed to cross the dividing lines?",
                new String[]{
                        "No, not under any circumstances.",
                        "Yes, to overtake another vehicle.",
                        "Yes, to overtake a pedal cyclist.",
                        "0"});

        trafficLights.add(new String[]{"A section of road is marked with double unbroken " +
                "dividing lines as in the diagram. When is a vehicle allowed to cross these lines?", "ld7"});
        answerListForTrafficLights.put("A section of road is marked with double unbroken dividing" +
                        " lines as in the diagram. When is a vehicle allowed to cross these lines?",
                new String[]{
                        "To enter or leave a street or driveway.",
                        "To overtake a slow vehicle ahead.",
                        "When there is no traffic coming the other way.",
                        "0"});

        trafficLights.add(new String[]{"When driving in traffic lanes (as shown in the diagram), you may change your lane -", ""});
        answerListForTrafficLights.put("When driving in traffic lanes (as shown in the diagram), you may change your lane -",
                new String[]{
                        "Without looking, provided you use your indicator",
                        "Only when it is safe to do so.",
                        "Provided you sound your horn to warn other drivers",
                        "1"});

        trafficLights.add(new String[]{"When two lanes merge into one (as shown in the diagram), who should give way?", "ld10"});
        answerListForTrafficLights.put("When two lanes merge into one (as shown in the diagram), who should give way?",
                new String[]{
                        "The vehicle which has to cross the lane line.",
                        "The faster vehicle.",
                        "The vehicle in the right-hand lane because it is overtaking.",
                        "0"});

        trafficLights.add(new String[]{"Looking at the diagram, which vehicle must give way?", "ld11"});
        answerListForTrafficLights.put("Looking at the diagram, which vehicle must give way?",
                new String[]{
                        "Vehicle A.",
                        "Either vehicle, there is no rule on giving way when merging.",
                        "Vehicle B.",
                        "2"});

        trafficLights.add(new String[]{"You must use your indicator lights when -", ""});
        answerListForTrafficLights.put("You must use your indicator lights when -",
                new String[]{
                        "Approaching a curve.",
                        "Changing lanes or turning left or right.",
                        "Double parking.",
                        "1"});

        trafficLights.add(new String[]{"If you hear the siren of an emergency vehicle, you must -", ""});
        answerListForTrafficLights.put("If you hear the siren of an emergency vehicle, you must -",
                new String[]{
                        "Take whatever action is necessary (with safety) to make way for the emergency vehicle.",
                        "Flash your headlights to warn other drivers.",
                        "Increase your speed to avoid the vehicle.",
                        "0"});

        trafficLights.add(new String[]{"You are in car marked A. You wish to overtake car marked B. You should -", "ld15"});
        answerListForTrafficLights.put("You are in car marked A. You wish to overtake car marked B. You should -",
                new String[]{
                        "Cross the line and overtake only if it is safe.",
                        "Cross the unbroken single line and overtake.",
                        "Wait behind car B until it moves into the left lane.",
                        "2"});

        trafficLights.add(new String[]{"When the road is marked this way are you permitted to " +
                "cross the lines to overtake the bicycle rider if the way forward is clear?", "ld16"});

        answerListForTrafficLights.put("When the road is marked this way are you permitted " +
                        "to cross the lines to overtake the bicycle rider if the way forward is clear?",
                new String[]{
                        "Yes, only if it is one-way traffic.",
                        "YES.",
                        "NO.",
                        "2"});

        trafficLights.add(new String[]{"When the road is marked this way are you permitted to cross the lines and overtake?", "ld17"});
        answerListForTrafficLights.put("When the road is marked this way are you permitted to cross the lines and overtake?",
                new String[]{
                        "No.",
                        "Yes.",
                        "Yes, only if the way ahead is clear.",
                        "0"});

        trafficLights.add(new String[]{"When starting to overtake you see the dividing lines ahead change to double unbroken lines. What should you do?", "ld18"});
        answerListForTrafficLights.put("When starting to overtake you see the dividing lines ahead change to double unbroken lines. What should you do?",
                new String[]{
                        "Continue to overtake because you started when the line was broken.",
                        "Keep overtaking and cut in in front of the other car as soon as possible.",
                        "Do not overtake because you are not permitted to overtake on double lines.",
                        "2"});

        trafficLights.add(new String[]{"You want to turn left at this intersection." +
                " There is an edge line that continues through the intersection.  " +
                "Are you permitted to turn here?", "ld22"});

        answerListForTrafficLights.put("You want to turn left at this intersection. " +
                        "There is an edge line that continues through the intersection. " +
                        " Are you permitted to turn here?\n",
                new String[]{
                        "Yes, you can cross an edge line to turn into or out of a street.",
                        "No, not under any circumstances.",
                        "Yes, only if you are in a taxi, hire car, bus or you live in that street.",
                        "0"});

        trafficLights.add(new String[]{"Before changing lanes you should -", "ld25"});
        answerListForTrafficLights.put("Before changing lanes you should -",
                new String[]{
                        "Signal in plenty of time, check your mirrors and look over your shoulder for other vehicles.",
                        "Speed up so you are going faster than the traffic in the other lane.",
                        "Signal for at least two seconds and quickly change lanes.",
                        "0"});

        trafficLights.add(new String[]{"You drive into a transit lane where the T2 rule applies." +
                " You have one passenger plus yourself. Are you permitted to remain in the transit lane?", "ld26"});

        answerListForTrafficLights.put("You drive into a transit lane where the T2 rule applies. " +
                        "You have one passenger plus yourself. Are you permitted to remain in the transit lane?",
                new String[]{
                        "Yes, you have two people in your car so you can drive in this lane.",
                        "No, because you only have one passenger you must move out of the transit lane immediately.",
                        "Yes, you can remain in the transit lane, but only if you are turning left in 250 metres.",
                        "0"});

        trafficLights.add(new String[]{"You change lanes and then see you are in a lane " +
                "where the T3 rule applies. There is no other traffic in this lane. You have" +
                " one passenger. What should you  do?", "ld27"});

        answerListForTrafficLights.put("You change lanes and then see you are in a lane where the" +
                        " T3 rule applies. There is no other traffic in this lane. You have one passenger. What should you  do?",
                new String[]{
                        "Change lanes as soon as it is safe because you are not permitted to" +
                                " travel in a T3 lane with only two people in your car.",
                        "Keep driving in the T3 lane because there is no other traffic in it.",
                        "Immediately pull over to the left and stop. Then wait until it is safe" +
                                " to continue in another lane.",
                        "0"});

        trafficLights.add(new String[]{"turn left at the next intersection 200 metres away. Can you travel in the transit lane at this point?", "ld28"});
        answerListForTrafficLights.put("turn left at the next intersection 200 metres away. Can you travel in the transit lane at this point?",
                new String[]{
                        "No, because you can only travel in the transit lane if the intersection you are turning left at is within 100 metres.",
                        "Yes, because you only have a short distance to drive.",
                        "Yes, if there is no traffic behind you.",
                        "0"});

        trafficLights.add(new String[]{"You are in car marked Y and want" +
                " to turn right using a median turning lane. A car marked O," +
                " coming towards you, is already in the median lane; it is slowing down" +
                " and indicating. Are you permitted to enter and" +
                " share the median turning lane?", "ld29"});

        answerListForTrafficLights.put("You are in car marked Y and want to" +
                        " turn right using a median turning lane. A car marked O, coming towards you, " +
                        "is already in the median lane; it is slowing down and indicating." +
                        " Are you permitted to enter and share the median turning lane?",
                new String[]{
                        "Yes, but you must be prepared to slow down and stop.",
                        "No, if another car is already in the median turning lane you must not use it.",
                        "Yes, but only if you race the other car and get to the turning position first.",
                        "0"});

        trafficLights.add(new String[]{"You are driving a car and want to pick up a passenger." +
                " The lane you want to stop in is a BUS LANE.  Are you permitted to stop there?", "ld32"});
        answerListForTrafficLights.put("You are driving a car and want to pick up a passenger." +
                        " The lane you want to stop in is a BUS LANE.  Are you permitted to stop there?",
                new String[]{
                        "Yes, if you pick the passenger up and then immediately drive off.",
                        "Yes, you are allowed to stop in a BUS LANE for as long as you like.",
                        "No, unless you are driving a hire car or a taxi.",
                        "2"});

        trafficLights.add(new String[]{"You are going to turn right from a one-way street. Where should you be when you start your turn?", "ld38"});
        answerListForTrafficLights.put("You are going to turn right from a one-way street. Where should you be when you start your turn?",
                new String[]{
                        "Position R. As close as possible to the right side of the road.",
                        "Any position if it is safe to do so.",
                        "Position M. From the middle of the road.",
                        "0"});

        trafficLights.add(new String[]{"Overtaking another vehicle requires good concentration and judgement. Which of the following statements is correct?", ""});
        answerListForTrafficLights.put("Overtaking another vehicle requires good concentration and judgement. Which of the following statements is correct?",
                new String[]{
                        "- You need to watch out for all large, long vehicles which are turning.",
                        "- It is best and safest to speed up when a vehicle behind you tries to overtake you.",
                        "- The faster the vehicle you are overtaking is going, the less distance you need to overtake.",
                        "0"});

        trafficLights.add(new String[]{"When driving on a multi-lane road with a speed limit of more than 80 km/h, which lane should you choose?", ""});
        answerListForTrafficLights.put("When driving on a multi-lane road with a speed limit of more than 80 km/h, which lane should you choose?",
                new String[]{
                        "The left lane unless overtaking.",
                        "The right lane to avoid slow moving vehicles.",
                        "Either left or right lane.",
                        "0"});

        trafficLights.add(new String[]{"Signalling is -", ""});
        answerListForTrafficLights.put("Signalling is -",
                new String[]{
                        "Always required before turning or lane changing.",
                        "- Not required when turning at T-intersections.",
                        "- Not required when turning at T-intersections.",
                        "0"});

        trafficLights.add(new String[]{"How should you merge with traffic when entering a motorway?", ""});
        answerListForTrafficLights.put("How should you merge with traffic when entering a motorway?",
                new String[]{
                        "Watch for a gap and increase your speed to safely merge with the traffic.",
                        "Slow down and force your way into the traffic.",
                        "Stop, then enter the traffic quickly.",
                        "0"});
    }

    public static void initializeAlcoholAndDrugs() {

        alcoholList = new ArrayList<>();
        answerListForAlcoholAndDrug = new HashMap<>();

        alcoholList.add(new String[]{"To reduce the effect of alcohol before driving or riding you should -", ""});
        answerListForAlcoholAndDrug.put("To reduce the effect of alcohol before driving or riding you should -",
                new String[]{
                        "Wait. The time depends on how much you have drunk.",
                        "Drink black coffee.",
                        "Have a glass of water.",
                        "0"});

        alcoholList.add(new String[]{"Before driving a motor vehicle or riding a motor cycle it is safest -", ""});
        answerListForAlcoholAndDrug.put("Before driving a motor vehicle or riding a motor cycle it is safest -",
                new String[]{
                        "Drink 1 middy (285 ml) of light (low alcohol) beer.",
                        "Drink 1 nip of spirits (30 ml or 1 oz).",
                        "Not to drink any alcohol.",
                        "2"});

        alcoholList.add(new String[]{"Is it an offence to refuse to take a POLICE breath test?", ""});
        answerListForAlcoholAndDrug.put("Is it an offence to refuse to take a POLICE breath test?",
                new String[]{
                        "Yes, always.",
                        "No, if you say you haven't been drinking alcohol.",
                        "No, if you are a learner driver.",
                        "0"});

        alcoholList.add(new String[]{"If you take medicine and then drink alcohol -", ""});
        answerListForAlcoholAndDrug.put("If you take medicine and then drink alcohol -",
                new String[]{
                        "It can have a particularly bad effect on your driving ability.",
                        "The alcohol will have less effect than if taken alone.",
                        "Your ability to react to emergencies will improve.",
                        "0"});

        alcoholList.add(new String[]{"If you are driving a bus, taxi, hire-car, heavy motor vehicle " +
                "(over 13.9 tonnes Gross Vehicle Mass), or a vehicle with a dangerous load, " +
                "it is an offence when the level of alcohol in your blood reaches -", ""});
        answerListForAlcoholAndDrug.put("If you are driving a bus, taxi, hire-car, heavy motor " +
                        "vehicle (over 13.9 tonnes Gross Vehicle Mass), or a vehicle with a dangerous load," +
                        " it is an offence when the level of alcohol in your blood reaches -",
                new String[]{
                        "0.02.",
                        "0.05.",
                        "0.08.",
                        "0"});

        alcoholList.add(new String[]{"Having 1 or 2 alcoholic drinks before driving -", ""});
        answerListForAlcoholAndDrug.put("Having 1 or 2 alcoholic drinks before driving -",
                new String[]{
                        "Improves your driving ability.",
                        "Will affect your reactions and judgement.",
                        "Has no effect on your driving ability.\n",
                        "1"});

        alcoholList.add(new String[]{"Even if you feel unaffected after drinking alcohol, you should -", ""});
        answerListForAlcoholAndDrug.put("Even if you feel unaffected after drinking alcohol, you should -",
                new String[]{
                        "Be aware that your abilities are decreased.",
                        "Drive, but avoid using freeways.",
                        "Spend more time than usual looking in the mirrors.",
                        "0"});

        alcoholList.add(new String[]{"Alcohol is a depressant. This means -", ""});
        answerListForAlcoholAndDrug.put("Alcohol is a depressant. This means -",
                new String[]{
                        "It slows down how quickly your brain works.",
                        "It speeds your brain up so you can work better.",
                        "It makes you calm down and think more clearly.",
                        "0"});

        alcoholList.add(new String[]{"After drinking alcohol you could -", ""});
        answerListForAlcoholAndDrug.put("After drinking alcohol you could -",
                new String[]{
                        "Misjudge speed (your own and others).",
                        "Be able to drive the same as you normally can.",
                        "Be able to pay close attention to details in the traffic.",
                        "0"});

        alcoholList.add(new String[]{"If you are going out and going to drink alcohol," +
                " the best way to avoid having to drink and drive is to -", ""});
        answerListForAlcoholAndDrug.put("If you are going out and going to drink alcohol," +
                        " the best way to avoid having to drink and drive is to -",
                new String[]{
                        "Organise before hand a way of getting home where you are not the driver.",
                        "After you have had a few drinks, start to think about how you will get home.",
                        "Wait for one hour after your last drink before you drive home.",
                        "0"});

        alcoholList.add(new String[]{"When drivers have been drinking, the crashes they are involved in are generally -", ""});
        answerListForAlcoholAndDrug.put("When drivers have been drinking, the crashes they are involved in are generally -",
                new String[]{
                        "More serious.",
                        "Less serious.",
                        "About the same.",
                        "0"});

        alcoholList.add(new String[]{"On Thursday, Friday and Saturday nights, how many serious crashes involve alcohol?", ""});
        answerListForAlcoholAndDrug.put("On Thursday, Friday and Saturday nights, how many serious crashes involve alcohol?",
                new String[]{
                        "About 50%.",
                        "About 30%.",
                        "About 10%.",
                        "0"});

        alcoholList.add(new String[]{"What is the safest way to stay under the legal alcohol limit?", ""});
        answerListForAlcoholAndDrug.put("What is the safest way to stay under the legal alcohol limit?",
                new String[]{
                        "Buying a breathalyser (alcohol measuring instrument).",
                        "Exercising and drinking black coffee.",
                        "Not drinking any alcohol.",
                        "2"});

        alcoholList.add(new String[]{"If you hold a learner or provisional licence class what " +
                "is the Blood Alcohol Concentration (BAC) limit?", ""});
        answerListForAlcoholAndDrug.put("If you hold a learner or provisional licence class " +
                        "what is the Blood Alcohol Concentration (BAC) limit?",
                new String[]{
                        "Zero.",
                        "0.02.",
                        "0.05.",
                        "0"});

        alcoholList.add(new String[]{"If you are taking any sort of medicine, you should -", ""});
        answerListForAlcoholAndDrug.put("If you are taking any sort of medicine, you should -",
                new String[]{
                        "Find out from your doctor or chemist whether the medicine or drug will " +
                                "affect your driving and act accordingly.",
                        "Only drive during the day after taking the medicine or drug.",
                        "Only drive a motor car not a heavy vehicle.",
                        "0"});

        alcoholList.add(new String[]{"Before taking any drugs and then driving it is most important to -", ""});
        answerListForAlcoholAndDrug.put("Before taking any drugs and then driving it is most important to -",
                new String[]{
                        "Know what the effects of the drug are.",
                        "Plan to have some other person with you.",
                        "Have some food in your stomach.",
                        "0"});

        alcoholList.add(new String[]{"If you have used illegal drugs you -", ""});
        answerListForAlcoholAndDrug.put("If you have used illegal drugs you -",
                new String[]{
                        "Should drink coffee before driving.",
                        "May drive only in light traffic.",
                        "Must not drive.",
                        "2"});

        alcoholList.add(new String[]{"If you are affected by a legal drug, such as a medicine (e.g. cold or allergy tablets) -", ""});
        answerListForAlcoholAndDrug.put("If you are affected by a legal drug, such as a medicine (e.g. cold or allergy tablets) -",
                new String[]{
                        "You must not drive.",
                        "You must have a passenger to help you drive.",
                        "You may drive only in daylight hours.",
                        "0"});

        alcoholList.add(new String[]{"You want to drive your car but you have a very bad headache." +
                " A friend gives you some of their headache tablets to kill the pain. " +
                "What should you do before you take these tablets?", ""});
        answerListForAlcoholAndDrug.put("You want to drive your car but you have a very bad " +
                        "headache. A friend gives you some of their headache tablets to kill the pain." +
                        " What should you do before you take these tablets?",
                new String[]{
                        "Read the label and confirm they are not prescription drugs and there are no special warnings on the label.",
                        "Ask your friend if the tablets have affected them.",
                        "Drink a large glass of milk because this reduces the adverse effects of medicines and drugs.",
                        "0"});

        alcoholList.add(new String[]{"If you are taking several medications and you want to drive, you should -", ""});
        answerListForAlcoholAndDrug.put("If you are taking several medications and you want to drive, you should -",
                new String[]{
                        "Ask your doctor if the combination of drugs will make it dangerous to drive.",
                        "Drive carefully around your local streets to see if you are affected.",
                        "Ask your passengers to let you know if you are not driving as well as you should.",
                        "0"});
    }

    public static void initializeFatigueAndDefensiveDriving() {

        fatigue = new ArrayList<>();
        answerListForFatigueAndDefensiveDriving = new HashMap<>();

        fatigue.add(new String[]{"Under good conditions, when driving behind any vehicle, at any speed, you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("Under good conditions, when driving behind any vehicle, at any speed, you should -",
                new String[]{
                        "Stay at least three seconds behind the vehicle in front of you.",
                        "Drive as close to the vehicle in front as possible.",
                        "Stay one second behind the vehicle in front of you.",
                        "0"});


        fatigue.add(new String[]{"When driving in wet weather, your vehicle will -", ""});
        answerListForFatigueAndDefensiveDriving.put("When driving in wet weather, your vehicle will -",
                new String[]{
                        "Take longer and further to stop, so slow down.",
                        "Stop in the same distance as on a dry road.",
                        "Handle better, so you can go faster.",
                        "0"});

        fatigue.add(new String[]{"At night, if an oncoming vehicle's headlights dazzle you, you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("At night, if an oncoming vehicle's headlights dazzle you, you should -",
                new String[]{
                        "Slow down, until your eyes recover.",
                        "Watch the centre line of the road.",
                        "Close your eyes for a short time until they recover.",
                        "0"});

        fatigue.add(new String[]{"If you get sleepy while driving, it is best to -", ""});
        answerListForFatigueAndDefensiveDriving.put("If you get sleepy while driving, it is best to -",
                new String[]{
                        "Stop, rest, and change drivers if possible.",
                        "Turn on the radio very loud.",
                        "Turn on the air conditioning or open the windows.",
                        "0"});

        fatigue.add(new String[]{"In wet weather when it becomes hard for you to see, you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("In wet weather when it becomes hard for you to see, you should -",
                new String[]{
                        "Turn on your headlights, slow down, and double your following distance behind the vehicle in front.",
                        "Turn your headlights on high beam.",
                        "Flash your headlights to warn other drivers.",
                        "0"});

        fatigue.add(new String[]{"If you are driving and it starts to rain, you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("If you are driving and it starts to rain, you should -",
                new String[]{
                        "Slow down using the brake gently, since rain and oil may create a slippery surface.",
                        "Put your lights on high beam so you can see better.",
                        "Put your hazard warning lights on and increase your speed to avoid the rain.",
                        "0"});

        fatigue.add(new String[]{"When driving on a slippery wet road, for example, one covered in early morning dew, your vehicle will -", ""});
        answerListForFatigueAndDefensiveDriving.put("When driving on a slippery wet road, for example, one covered in early morning dew, your vehicle will -",
                new String[]{
                        "Be easier to steer and handle.",
                        "Be heavier to steer.",
                        "Take longer and further to stop.",
                        "2"});


        fatigue.add(new String[]{"Why should you avoid heavy braking on a wet road?", ""});
        answerListForFatigueAndDefensiveDriving.put("Why should you avoid heavy braking on a wet road?",
                new String[]{
                        "Your wheels may skid and cause a loss of control.",
                        "If the wheels lock up your handbrake may not work.",
                        "You might wet pedestrians walking along the footpath.",
                        "0"});

        fatigue.add(new String[]{"At night you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("At night you should -",
                new String[]{
                        "Drive closer to the vehicle in front so they can see you better.",
                        "Leave a longer gap behind the vehicle in front.",
                        "Use your hazard warning lights when overtaking another vehicle.",
                        "1"});

        fatigue.add(new String[]{"When it is very foggy during the day or night and your vehicle has no fog lights, you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("When it is very foggy during the day or night and your vehicle has no fog lights, you should -",
                new String[]{
                        "Slow down and use your low beam headlights and hazard warning lights to make your vehicle seen.",
                        "Put on your high beam lights.",
                        "Follow closer to other vehicles.",
                        "0"});

        fatigue.add(new String[]{"When going on a long trip, out of the following which is the most important to do?", ""});
        answerListForFatigueAndDefensiveDriving.put("When going on a long trip, out of the following which is the most important to do?",
                new String[]{
                        "Make sure your horn is working.",
                        "Have a good meal before driving.",
                        "Get plenty of rest before starting out.",
                        "2"});

        fatigue.add(new String[]{"At night, when you approach an oncoming vehicle, you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("At night, when you approach an oncoming vehicle, you should -",
                new String[]{
                        "Carefully watch the vehicle by looking directly at its headlights.",
                        "Put your lights on high beam, to make your vehicle more easily seen.",
                        "Not look at its headlights, but keep left and watch the left of the road.",
                        "2"});

        fatigue.add(new String[]{"Which of the following attitudes is most likely to make you a safer driver?", ""});
        answerListForFatigueAndDefensiveDriving.put("Which of the following attitudes is most likely to make you a safer driver?",
                new String[]{
                        "When I drive, I have the main responsibility for my safety and the safety of other road users.",
                        "It is up to other drivers to avoid crashing into me.",
                        "Crashing or not crashing is a matter of luck.",
                        "0"});

        // added pic FD028
        fatigue.add(new String[]{"You are about to move away from the kerb in your car. What is the last thing you should do before you move into traffic?", "fd28"});
        answerListForFatigueAndDefensiveDriving.put("You are about to move away from the kerb in your car. What is the last thing you should do before you move into traffic?",
                new String[]{
                        "Check over your shoulder.",
                        "Adjust your seat.",
                        "Put on your seat belt.",
                        "0"});

        fatigue.add(new String[]{"What is the best way to avoid hitting other vehicles, people or animals when moving off from the kerb?", ""});
        answerListForFatigueAndDefensiveDriving.put("What is the best way to avoid hitting other vehicles, people or animals when moving off from the kerb?",
                new String[]{
                        "Check your mirrors and look over your shoulder before moving off from the kerb.",
                        "Have a good look around while you walk up to your car and then drive off as soon as you can.",
                        "Sound your horn before moving away from the kerb to warn people of your intentions.",
                        "0"});

        fatigue.add(new String[]{"Many people crash within the first few years of driving. What is the best way of learning to drive on your own without crashing?", ""});
        answerListForFatigueAndDefensiveDriving.put("Many people crash within the first few years of driving. What is the best way of learning to drive on your own without crashing?",
                new String[]{
                        "Drive in every kind of traffic situation as soon as you get your licence.",
                        "Drive as much as you can with friends on the way to parties.",
                        "Start driving in daylight where it is not too busy and only drive in busier traffic as your driving gets better.\n",
                        "2"});

        fatigue.add(new String[]{"It is important to scan while driving so you can see everything that is happening on the road. What does scanning involve?", ""});
        answerListForFatigueAndDefensiveDriving.put("It is important to scan while driving so you can see everything that is happening on the road. What does scanning involve?",
                new String[]{
                        "Continually looking ahead, to the sides and using all mirrors when driving.",
                        "Looking in the rear and side mirrors continually when driving.",
                        "Looking further ahead down the road when driving.",
                        "0"});

        // added pic FD033
        fatigue.add(new String[]{"If you are a new driver and first start to drive at night you should -", "fd33"});
        answerListForFatigueAndDefensiveDriving.put("If you are a new driver and first start to drive at night you should -",
                new String[]{
                        "Drive mainly on streets that you know well.",
                        "Drive mainly in unfamiliar streets.",
                        "Drive long distances to improve your concentration.",
                        "0"});

        fatigue.add(new String[]{"You set out on a fairly long drive to see some friends. After a while you start feeling tired. What should you do?", ""});
        answerListForFatigueAndDefensiveDriving.put("You set out on a fairly long drive to see some friends. After a while you start feeling tired. What should you do?",
                new String[]{
                        "Stop at a shop and get a drink that contains caffeine to help keep you awake.",
                        "Pull off the road, stop and rest until you no longer feel tired.",
                        "Make sure you get plenty of fresh air circulating inside the car by winding down your window.",
                        "1"});

        fatigue.add(new String[]{"You are driving an older relative for an appointment and are running late. They ask you to go faster to get there on time. You should -", ""});
        answerListForFatigueAndDefensiveDriving.put("You are driving an older relative for an appointment and are running late. They ask you to go faster to get there on time. You should -",
                new String[]{
                        "Choose a safe speed and say you will not go any faster.",
                        "Take the advice of a more experience driver and go faster where you can.",
                        "Drop them off at the train station.",
                        "0"});

        fatigue.add(new String[]{"You are planning to drive from Sydney to the Gold Coast with" +
                " some friends. To minimise fatigue and make the trip as safe as possible you should -", ""});
        answerListForFatigueAndDefensiveDriving.put("You are planning to drive from Sydney to the Gold Coast " +
                        "with some friends. To minimise fatigue and make the trip as safe as possible you should -",
                new String[]{
                        "Aim to drive for as long as possible when you are feeling good so you can arrive earlier.",
                        "Drive mostly at night as there is less traffic on the road and therefore less risk of crashing.",
                        "Drive during the day, take plenty of breaks and share driving if possible.",
                        "2"});

        // added pic FD037
        fatigue.add(new String[]{"You should leave a gap between your vehicle and the one you are following. In good conditions the gap should be -", "fd37"});
        answerListForFatigueAndDefensiveDriving.put("You should leave a gap between your vehicle and the one you are following. In good conditions the gap should be -",
                new String[]{
                        "3 seconds.",
                        "1 seconds.",
                        "2 seconds.",
                        "0"});

        fatigue.add(new String[]{"It is night time and you are driving home from the movies." +
                " You are travelling in a line of vehicles. What size gap should you leave " +
                "between your vehicle and the vehicles in front of you?", ""});
        answerListForFatigueAndDefensiveDriving.put("It is night time and you are driving home from " +
                        "the movies. You are travelling in a line of vehicles. What size gap should you " +
                        "leave between your vehicle and the vehicles in front of you?",
                new String[]{
                        "A gap of about 4 seconds as it is easy to misjudge distances at night.",
                        "A gap of about 2 seconds so you can watch the vehicles in front closely and see when they are stopping.",
                        "The same 3-second gap you would leave during the day.",
                        "0"});

        fatigue.add(new String[]{"While driving, you come across aggressive, selfish or ignorant driving behaviour by another driver. You should -", ""});
        answerListForFatigueAndDefensiveDriving.put("While driving, you come across aggressive, selfish or ignorant driving behaviour by another driver. You should -",
                new String[]{
                        "Stay calm and in control of your vehicle at all times.",
                        "Respond by using your horn and/or flashing your lights to let the driver know how you feel.",
                        "Chase the car to tell the driver how to drive.",
                        "0"});

    }

    public static void initializeICAC() {
        ICAC = new ArrayList<>();
        answerListForICAC = new HashMap<>();

        ICAC.add(new String[]{"What will happen if you are caught cheating on the knowledge test?", ""});
        answerListForICAC.put("What will happen if you are caught cheating on the knowledge test?",
                new String[]{"You will not be allowed to take another test for 6 weeks.",
                        "You will never be allowed to take another test.", "Nothing, there is no penalty.",
                        "0"
                });

        ICAC.add(new String[]{"What will happen if you offer a testing officer a bribe to pass your" +
                " driving test?", ""});
        answerListForICAC.put("What will happen if you offer a testing officer a bribe to pass your driving test?",
                new String[]{"Action will be taken against you. The penalties are severe and " +
                        "include fines and imprisonment.", "Only the testing officer will be investigated.",
                        "Nothing, there is no penalty.", "0"});

        ICAC.add(new String[]{"What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to " +
                "him or her?", ""});
        answerListForICAC.put("What will happen if a testing officer asks you for a bribe to pass your driving test and you give it to " +
                        "him or her?",
                new String[]{"Only the testing officer will be investigated.",
                        "Action will be taken against you. The penalties are severe and  " +
                                "include fines and imprisonment.",
                        "Nothing, there is no penalty.", "1"});


    }

    public static void initializeGeneralKnowledge() {

        generalList = new ArrayList<>();
        answerListForGeneralKnowledge = new HashMap<>();
        generalList.add(new String[]{"Can a P1 or P2 provisional driver legally instruct a learner driver?", ""});
        answerListForGeneralKnowledge.put("Can a P1 or P2 provisional driver legally instruct a learner driver?",
                new String[]{"Yes, provided the provisional driver has held a P2 licence for more than 6 months.",
                        "No.",
                        "Yes, provided L and P1 or P2 plates are displayed.", "1"});

        generalList.add(new String[]{"To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence " +
                "for a minimum period of?", ""});
        answerListForGeneralKnowledge.put("To progress to a P2 provisional licence, a P1 provisional driver must hold a P1 licence " +
                        "for a minimum period of?",
                new String[]{"24 months.", "12 months.", "18 months.", "1"});

        generalList.add(new String[]{"If one or two of your wheels run off the edge of the roadway, you should?", ""});
        answerListForGeneralKnowledge.put("If one or two of your wheels run off the edge of the roadway, you should?",
                new String[]{"Slow down gradually and ease back onto the road.",
                        "Slow down quickly by braking hard.",
                        "Increase your speed and drive back on the road.", "0"});

        generalList.add(new String[]{"If there are no lanes marked on the road, you should drive?", ""});
        answerListForGeneralKnowledge.put("If there are no lanes marked on the road, you should drive?",
                new String[]{"Anywhere on your side of the road.",
                        "Along the middle of the road.",
                        "Near to the left-hand side of the road.", "2"});

        generalList.add(new String[]{"If you intend to turn left, are you required to give a signal?", "gk010"});
        answerListForGeneralKnowledge.put("If you intend to turn left, are you required to give a signal?",
                new String[]{"Yes, if turn signals are fitted to your vehicle.",
                        "No, if turning left from a lane marked left turn only.",
                        "No, if arrows are marked on the roadway.", "0"});

        generalList.add(new String[]{"What is meant by this sign on or near a bridge?", "gk013"});
        answerListForGeneralKnowledge.put("What is meant by this sign on or near a bridge?",
                new String[]{"Stop at all times before crossing the bridge and only give " +
                        "way to pedestrians who may be crossing.",
                        "Slow down and be prepared to give way to " +
                                "vehicles travelling in the opposite direction.",
                        "Do not overtake a vehicle travelling in the same direction.", "1"});

        generalList.add(new String[]{"When reversing, you should?", "gk014"});
        answerListForGeneralKnowledge.put("When reversing, you should?",
                new String[]{"Unbuckle your seat belt so you can reverse as quickly " +
                        "as possible.",
                        "Take care and never reverse for a greater " +
                                "distance and time than is necessary.",
                        "Sound your horn to warn other drivers.", "1"});

        generalList.add(new String[]{"How close can you park to another vehicle when parked parallel to the kerb?", "gk016"});
        answerListForGeneralKnowledge.put("How close can you park to another vehicle when parked parallel to the kerb?",
                new String[]{"You must leave at least 1 metre front and back.",
                        "You must leave at least 2 metres from the front only.",
                        "You must leave at least 3 metres front and back.", "0"});

        generalList.add(new String[]{"Where there is parallel kerbside parking, are you allowed to double-park alongside a parked " +
                "vehicle?", "gk017"});
        answerListForGeneralKnowledge.put("Where there is parallel kerbside parking, are you allowed to double-park alongside a parked " +
                        "vehicle?",
                new String[]{"Yes, if not obstructing traffic.",
                        "Yes, if delivering goods.",
                        "No, not at any time.", "2"});

        generalList.add(new String[]{"Do you have any responsibilities when opening a vehicle door on a roadway?", ""});
        answerListForGeneralKnowledge.put("Do you have any responsibilities when opening a vehicle door on a roadway?",
                new String[]{"Yes, you must not open a door if you are likely to cause danger to " +
                        "road users or impede traffic.",
                        "No, any following traffic must stop if the door interferes with its progress.",
                        "No, there is no regulation to cover this situation.", "0"});

        generalList.add(new String[]{"Are you permitted to park on a median strip or traffic island?", ""});
        answerListForGeneralKnowledge.put("Are you permitted to park on a median strip or traffic island?",
                new String[]{"No, not at any time.",
                        "Yes, in daylight hours.",
                        "Yes, but for no more than 30 minutes.", "0"});

        generalList.add(new String[]{"Are you permitted to park in the direction of the arrow?", "gk028"});
        answerListForGeneralKnowledge.put("Are you permitted to park in the direction of the arrow?",
                new String[]{"Yes, if you are carrying two or more passengers.",
                        "Yes, provided no taxis are using the area.",
                        "No, not at any time.", "2"});

        generalList.add(new String[]{"When driving at sunset or dawn on a dark day, what should you do?", ""});
        answerListForGeneralKnowledge.put("When driving at sunset or dawn on a dark day, what should you do?",
                new String[]{"Turn on your lights on low beam.",
                        "Keep your sunglasses on to cut down headlight glare.",
                        "Turn on your hazard warning lights.", "0"});

        generalList.add(new String[]{"You are driving at night with your headlights on high beam. When should you dip your headlights?", ""});
        answerListForGeneralKnowledge.put("You are driving at night with your headlights on high beam. When should you dip your headlights?",
                new String[]{"Never, you are allowed to drive with your lights on high beam at all times.",
                        "When within 200 metres of an oncoming vehicle only.",
                        "When within 200 metres of the vehicle ahead or an oncoming one.", "2"});

        generalList.add(new String[]{"You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus " +
                "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you " +
                "should?", "gk031"});
        answerListForGeneralKnowledge.put("You are driving in a 60 km/h zone, with only one lane for traffic in your direction. You see a bus " +
                        "ahead (with this sign displayed on the rear) signalling its intention to pull out from a bus stop, you " +
                        "should?",
                new String[]{"Slow down, and give way to the bus as it has " +
                        "priority.",
                        "Sound your horn to stop the bus from pulling out.",
                        "Continue at your normal speed as the bus does not have " +
                                "priority.", "0"});

        generalList.add(new String[]{"Is it an offence to obstruct clear vision of your number plates?", ""});
        answerListForGeneralKnowledge.put("Is it an offence to obstruct clear vision of your number plates?",
                new String[]{
                        "Yes, at any time.",
                        "Yes, but it is legal for a towbar or bicycle rack to cover the rear number plate.",
                        "No, you are allowed to cover your number plates if you want to.",
                        "0"});

        generalList.add(new String[]{"Before driving on a freeway, which of the following should you do?", ""});
        answerListForGeneralKnowledge.put("Before driving on a freeway, which of the following should you do?",
                new String[]{
                        "Make sure your vehicle has enough fuel, oil, water and the correct tyre pressure.",
                        "Take your street directory in case you get lost.",
                        "Take something to calm your nerves before driving.",
                        "0"});

        generalList.add(new String[]{"What must you do if you miss your exit on a freeway?", ""});
        answerListForGeneralKnowledge.put("What must you do if you miss your exit on a freeway?", new String[]{
                "Continue until you reach the next appropriate exit.",
                "Stop, and reverse back along the freeway to the exit you missed.",
                "Stop immediately and turn around.", "0"});


        generalList.add(new String[]{"As you leave a freeway, which of the following should you check?", ""});
        answerListForGeneralKnowledge.put("As you leave a freeway, which of the following should you check?",
                new String[]{
                        "Your speed.",
                        "Fuel gauge.",
                        "Windscreen wipers.",
                        "0"});


        generalList.add(new String[]{"When can a private car travel in a lane marked by this sign?", "gk037"});
        answerListForGeneralKnowledge.put("When can a private car travel in a lane marked by this sign?",
                new String[]{
                        "Only to overtake another vehicle.",
                        "When carrying at least two passengers.",
                        "Only within 100 metres of making a turn.",
                        "2"});

        generalList.add(new String[]{"Are you permitted to drive a car towing more than one trailer?", ""});
        answerListForGeneralKnowledge.put("Are you permitted to drive a car towing more than one trailer?",
                new String[]{
                        "No, not at all.",
                        "Yes, if the combined length of vehicle and trailers does not exceed 15 metres.",
                        "Yes, provided you have held a licence for two years.",
                        "0"});

        generalList.add(new String[]{"What must you do when you are towing a caravan to help other vehicles overtake?", ""});
        answerListForGeneralKnowledge.put("What must you do when you are towing a caravan to help other vehicles overtake?",
                new String[]{
                        "Drive at least 25 km/h below the speed limit.",
                        "Keep at least 60 metres behind heavy vehicles or other vehicles towing caravans.",
                        "Stop immediately and let the faster vehicle overtake.",
                        "1"});

        generalList.add(new String[]{"Are you permitted to tow a caravan with a person riding in the caravan?", ""});
        answerListForGeneralKnowledge.put("Are you permitted to tow a caravan with a person riding in the caravan?",
                new String[]{
                        "Yes, provided you do not exceed 60 km/h.",
                        "Yes, if the person(s) in the caravan are over 12 years of age.",
                        "No, not under any circumstances.",
                        "2"});

        generalList.add(new String[]{"Before driving a long distance at fast speed or carrying a full car load, you should -", ""});
        answerListForGeneralKnowledge.put("Before driving a long distance at fast speed or carrying a full car load, you should -",
                new String[]{
                        "Check your tyre pressure, and if necessary, increase it to what the manufacturer recommends.",
                        "Make sure you have a street directory, so you know where you are going.",
                        "Have a large meal and a cup of coffee.",
                        "0"});

        generalList.add(new String[]{"If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -", ""});
        answerListForGeneralKnowledge.put("If an oncoming vehicle crosses the centre line and is coming straight at you and you cannot stop, you should -",
                new String[]{
                        "Brake, look for room to the left, sound your horn and flash your lights.",
                        "Slow down and hope that the driver will turn away.",
                        "Drive onto the wrong side of the road and hope the other vehicle does not do the same.",
                        "0"});

        generalList.add(new String[]{"If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -", ""});
        answerListForGeneralKnowledge.put("If you are involved in an accident where your vehicle needs to be towed away and the Police does not attend the crash scene, you -",
                new String[]{
                        "Do not need to report the accident to the Police.",
                        "Must report the accident to the Police Station nearest to where the accident happened within 24 hours.",
                        "Only need to report the accident to the Police if someone was injured.",
                        "1"});

        generalList.add(new String[]{"If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?", "gk045"});
        answerListForGeneralKnowledge.put("If your vehicle is involved in an accident (regardless of the damage), what details must you give, to the other driver(s), if asked?",
                new String[]{
                        "You must let them see your licence, take details, and give the name and address of the vehicle's owner.",
                        "No details at all until you have contacted your insurance company.",
                        "Only your name and address details if a Policeman asks for them.",
                        "0"});

        generalList.add(new String[]{"If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?", "gk046"});
        answerListForGeneralKnowledge.put("If a vehicle you are driving is involved in an accident and a person is injured, what must you do after stopping?",
                new String[]{
                        "Render every assistance and take immediate steps to have an ambulance notified. Then call the Police.\n",
                        "Only call the Police if the accident also resulted in over $500 worth of property damage.",
                        "Report the accident to Police within seven days.",
                        "0"});

        generalList.add(new String[]{"Stop signs or flashing lights at railway crossings should always be obeyed, because -", ""});
        answerListForGeneralKnowledge.put("Stop signs or flashing lights at railway crossings should always be obeyed, because -",
                new String[]{
                        "Trains are fast, heavy and cannot stop quickly.",
                        "Pedestrians might be crossing.",
                        "Car brakes often fail.",
                        "0"});

        generalList.add(new String[]{"You should not drive across a railway level crossing when -", ""});
        answerListForGeneralKnowledge.put("You should not drive across a railway level crossing when -",
                new String[]{
                        "Traffic is blocking the other side.",
                        "You are towing a caravan.",
                        "A station is nearby.",
                        "0"});

        generalList.add(new String[]{"You should use your right-hand indicator when -", ""});
        answerListForGeneralKnowledge.put("You should use your right-hand indicator when -",
                new String[]{
                        "You are about to stop.",
                        "You intend to move to the right, at any time.",
                        "You intend to slow down.",
                        "1"});

        generalList.add(new String[]{"When merging onto the freeway from the entrance, you should -", ""});
        answerListForGeneralKnowledge.put("When merging onto the freeway from the entrance, you should -",
                new String[]{
                        "Look for a large enough break in the traffic and adjust your speed so as to fit into the traffic flow.",
                        "Sound your horn, turn on your indicator lights and move onto the freeway.",
                        "Stop and check the traffic behind you on the entrance.",
                        "0"});

        generalList.add(new String[]{"If you see a sign indicating road repairs are going on, you should -", ""});
        answerListForGeneralKnowledge.put("If you see a sign indicating road repairs are going on, you should -",
                new String[]{
                        "Maintain the same speed.",
                        "Stop immediately and wait for instructions.",
                        "Slow down and watch for traffic controllers and instructions.",
                        "2"});

        generalList.add(new String[]{"You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?", ""});
        answerListForGeneralKnowledge.put("You see a broken yellow line painted on the roadway adjacent to the kerb. What does it mean?",
                new String[]{
                        "Clearway restrictions apply - you must not stop during the clearway hours.",
                        "You may at any time, park along this part of the road for 1 hour only.",
                        "Bicycle riders must ride along the yellow line.",
                        "0"});

        generalList.add(new String[]{"If you see a horse and rider on the road what should you do?", ""});
        answerListForGeneralKnowledge.put("If you see a horse and rider on the road what should you do?",
                new String[]{
                        "Slow down and give them plenty of room.",
                        "Sound your horn to warn the rider.",
                        "Speed up to pass the horse.",
                        "0"});

        generalList.add(new String[]{"A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                "drive this type of vehicle?", ""});
        answerListForGeneralKnowledge.put("A friend lends you a van that has seats for ten passengers. What type of licence do you need to " +
                        "drive this type of vehicle?",
                new String[]{"A heavy rigid vehicle licence."
                        , "A car licence."
                        , "A small bus licence.", "1"});

        generalList.add(new String[]{"What are you required to do if you develop a serious medical condition that could affect your " +
                "driving?", ""});
        answerListForGeneralKnowledge.put("What are you required to do if you develop a serious medical condition that could affect your " +
                "driving?", new String[]{"Hand your licence in at the nearest police station.",
                "Tell your doctor and let him or her notify the RTA.", "Once you become aware of the " +
                "condition you must notify the RTA.", "2"});

        generalList.add(new String[]{"A friend lends you his car. It is very noisy and blows a lot of smoke. He tells you the vehicle has " +
                "been given a defect notice but it's still OK to drive it. What should you do?", ""});
        answerListForGeneralKnowledge.put("A friend lends you his car. It is very noisy and blows a lot of smoke. He tells you the vehicle has " +
                        "been given a defect notice but it's still OK to drive it. What should you do?",
                new String[]{"Before you borrow the car check the defect notice to make sure it is " +
                        "legal to drive the car.", "Borrow the car, but always drive it 10 Km/h below the speed limit.",
                        "Borrow the car but only drive on streets where the car will not be a danger to " +
                                "others.", "0"});


        generalList.add(new String[]{"Your car registration expires today. You have your car inspected for registration renewal but it fails " +
                "the inspection. What should you do?", ""});
        answerListForGeneralKnowledge.put("Your car registration expires today. You have your car inspected for registration renewal but it fails " +
                        "the inspection. What should you do?",
                new String[]{"You have seven days to have the car repaired, after which the RTA considers it to " +
                        "be unregistered.",
                        "After today you must not drive the car until it has been repaired, " +
                                "passed another inspection and registered.",
                        "Go to the RTA and ask them to renew your registration and tell them you will soon " +
                                "get the car fixed.", "1"});


        generalList.add(new String[]{"You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?", ""});
        answerListForGeneralKnowledge.put("You buy a car and find that the spare tyre is smooth; the tread is only just visible. If you get a " +
                "puncture will it be legal to drive the car with a smooth spare tyre?", new String[]{
                "Yes, but you must get the puncture fixed within 24 hours.", "Yes, if the tyre is correctly inflated and the side walls of the tyre are in good " +
                "condition.", "No, it's illegal to drive a car with a smooth tyre even if it is the spare.", "2"});


        generalList.add(new String[]{"You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?", ""});
        answerListForGeneralKnowledge.put("You borrow a friend's car and find that the position of the driver's seat puts you sitting a long way " +
                "from the steering wheel and controls. What should you do?", new String[]{
                "Put up with the discomfort; you should not adjust another person's seat.",
                "Adjust the seat forward so it's right for you.", "Ask your friend for a cushion to place behind your back.", "1"});


        generalList.add(new String[]{"You hold an unrestricted licence and are driving at 100 km/h in the country and pass this sign. " +
                "What should you do?", "gk070"});
        answerListForGeneralKnowledge.put("You hold an unrestricted licence and are driving at 100 km/h in the country and pass this sign. " +
                "What should you do?", new String[]{"You can continue to drive at 100 km/h if there are fences to stop " +
                "farm animals from getting on the road.", "For the next 5 kilometres you must not exceed 60 km/h unless you " +
                "pass an end farm animals speed limit sign.", "Slow down to a speed that will allow you to stop to " +
                "avoid crashing into farm animals on the road.", "2"});


        generalList.add(new String[]{"You are turning right from one of two right turn only lanes. How should you use your indicators?", "gk071"});
        answerListForGeneralKnowledge.put("You are turning right from one of two right turn only lanes. How should you use your indicators?",
                new String[]{"Indicate with your right hand signal the " +
                        "same as any other right hand turn.", "You should not indicate at all because it might " +
                        "confuse other drivers.", "Indicating in this situation is optional. Give a right " +
                        "hand signal if you think it will help other road users.", "0"});


        generalList.add(new String[]{"You are approaching an intersection that has a red light camera. The lights turn yellow when you " +
                "are too close to stop safely. The lights go red as you get to the other side of the intersection. Will " +
                "you receive a penalty notice?", ""});
        answerListForGeneralKnowledge.put("You are approaching an intersection that has a red light camera. The lights turn yellow when you " +
                "are too close to stop safely. The lights go red as you get to the other side of the intersection. Will " +
                "you receive a penalty notice?", new String[]{"Possibly, because you were in the intersection when the lights turned red.", "No, because the camera only takes a photo if you cross the stop line " +
                "after the lights turn red.", "Yes, but a driver is entitled to advise the Police Service and have the case heard " +
                "by a court.", "1"});


        generalList.add(new String[]{"You are driving on a freeway and realise you forgot something at home. You want to go back for it. " +
                "Can you do a U-turn on this road?", ""});
        answerListForGeneralKnowledge.put("You are driving on a freeway and realise you forgot something at home. You want to go back for it. " +
                "Can you do a U-turn on this road?", new String[]{"Yes, any time.", "Yes, providing you use the gravel joining roads.",
                "No, not at any time.", "2"});


        generalList.add(new String[]{"You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -", ""});
        answerListForGeneralKnowledge.put("You have a six year old child with you in your car. You have just parked so you can collect a " +
                "prescription from the chemist. You should -", new String[]{"Take the child with you.", "Leave the child in the car.",
                "Ask an older person sitting nearby to watch the child.", "0"});


        generalList.add(new String[]{"You want to leave your automatic car parked on a street sloping uphill. You should -", "gk078"});
        answerListForGeneralKnowledge.put("You want to leave your automatic car parked on a street sloping uphill. You should -",
                new String[]{"Park only on flat areas.", "Turn the wheels away from the kerb.",
                        "Put the handbrake on and put the " +
                                "transmission in \"P\" (park).", "2"});


        generalList.add(new String[]{"You have just passed this sign. Can you park on this road?", "gk080"});
        answerListForGeneralKnowledge.put("You have just passed this sign. Can you park on this road?", new String[]{
                "No, not at any time.", "Yes.", "Yes, but only in daylight hours.", "0"});


        generalList.add(new String[]{"Where there are double dividing lines, you may park -", "gk082"});
        answerListForGeneralKnowledge.put("Where there are double dividing lines, you may park -", new String[]{
                "At least three metres from the dividing lines.", "At least two metres from the dividing lines.",
                "One metre from the dividing lines.", "0"});


        generalList.add(new String[]{"If there are no signs or markings to advise you, can you choose any of these methods of parking?", "gk083"});
        answerListForGeneralKnowledge.put("If there are no signs or markings to advise you, can you choose any of these methods of parking?",
                new String[]{"No, only N is correct.", "Yes. M, N and O are all legal.",
                        "Yes, N is best but M and O are quite legal.", "0"});


        generalList.add(new String[]{"You should angle park -", "gk084"});
        answerListForGeneralKnowledge.put("You should angle park -", new String[]{"Where the road is very wide."
                , "Where there are markings or a sign indicating angle park.", "Where there is plenty of room from the " +
                "centre line.", "1"});


        generalList.add(new String[]{"This bridge has only just enough room for two vehicles. As you come close to it you should -", "gk086"});
        answerListForGeneralKnowledge.put("This bridge has only just enough room for two vehicles. As you come close to it you should -",
                new String[]{"Sound your horn to warn the other driver.", "Maintain your speed, keeping to the limit.",
                        "Slow down and pay extra attention.", "2"});


        generalList.add(new String[]{"Which side mirror is adjusted best?", "gk087"});
        answerListForGeneralKnowledge.put("Which side mirror is adjusted best?",
                new String[]{"Mirror B.", "Mirror A.", "Mirror C.", "1"});


        generalList.add(new String[]{"You should be particularly careful at this intersection because", "gk088"});
        answerListForGeneralKnowledge.put("You should be particularly careful at this intersection because",
                new String[]{"Intersections cause crashes.",
                        "The building blocks a good view of the " +
                                "side street.", "It looks a bit tricky.", "1"});


        generalList.add(new String[]{"You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                "pressures you to go around the bike and drive faster. How should you respond?", ""});
        answerListForGeneralKnowledge.put("You are in busy traffic and slow down for a bicycle rider. A driver behind you beeps a horn and " +
                        "pressures you to go around the bike and drive faster. How should you respond?",
                new String[]{"Overtake the bike quickly and speed up to stop the other driver becoming " +
                        "aggressive.", "Go slower because the slower you go the safer you are.",
                        "Resist the pressure, stay calm and overtake the cyclist when it is " + "safe.",
                        "2"});

        generalList.add(new String[]{"You hear the siren of an ambulance approaching you from behind. You should?", "gk090"});
        answerListForGeneralKnowledge.put("You hear the siren of an ambulance approaching you from behind. You should?",
                new String[]{
                        "Move into the left lane.",
                        "Slow down to the speed of other traffic.",
                        "Continue at the same speed.",
                        "0"});

        generalList.add(new String[]{"You are driving along this road. You hear an ambulance's siren and see the ambulance in your\n" +
                "mirror. You should?", "gk091"});
        answerListForGeneralKnowledge.put("You are driving along this road. You hear an ambulance's siren and see the ambulance in your\n" +
                        "mirror. You should?",
                new String[]{
                        "Move to the left and make way for the ambulance.",
                        "Turn into a driveway on the right hand side of the road",
                        "- Move to the right and make way for the ambulance.",
                        "0"});

        generalList.add(new String[]{"You are about to make a right hand turn at this intersection. You have the green light. You hear a\n" +
                "siren and then see that a fire truck will soon overtake you. You should?", "gk092"});
        answerListForGeneralKnowledge.put("You are about to make a right hand turn at this intersection. You have the green light. You hear a\n" +
                        "siren and then see that a fire truck will soon overtake you. You should?",
                new String[]{
                        "Stop and let the fire truck overtake you.",
                        "Continue and make the turn because you have the right of way.",
                        "Speed up to beat the fire truck.",
                        "0"});

        generalList.add(new String[]{"When you come across roadworks?", "gk093"});
        answerListForGeneralKnowledge.put("When you come across roadworks?",
                new String[]{
                        "You must obey the signs that are displayed at all times.",
                        "You only have to obey the signs when there are workers about.",
                        "You only have to obey the signs during working hours.",
                        "0"});

        generalList.add(new String[]{"Generally, if you hear the siren of an emergency vehicle you should?", ""});
        answerListForGeneralKnowledge.put("Generally, if you hear the siren of an emergency vehicle you should?",
                new String[]{
                        "Pull over to the left until the emergency vehicle passes.",
                        "Immediately come to a stop.",
                        "Let the emergency vehicle pass and follow it closely behind.",
                        "0"});

        generalList.add(new String[]{"You are approaching a green light in vehicle A. An ambulance sounding its siren is approaching\n" +
                "the same intersection and has a red light. You should?", "95"});
        answerListForGeneralKnowledge.put("You are approaching a green light in vehicle A. An ambulance sounding its siren is approaching\n" +
                        "the same intersection and has a red light. You should?",
                new String[]{
                        "Slow down and stop if necessary to prevent\n" +
                                "getting in its way.",
                        "Keep driving because you have the green light.",
                        "Pull over to the left before you reach the intersection.",
                        "0"});

        generalList.add(new String[]{"When you see these lights flashing on the back of a bus, what should you do?", "gk099"});
        answerListForGeneralKnowledge.put("When you see these lights flashing on the back of a bus, what should you do?",
                new String[]{
                        "Drive carefully at no more than 40 km/h.",
                        "Overtake the bus only while the lights are flashing.",
                        "Stop and wait for the lights to stop flashing.",
                        "0"});

        generalList.add(new String[]{"You are driving at night and there is no other traffic around you. When can you use your headlights\n" +
                "on high beam?", "gk100"});
        answerListForGeneralKnowledge.put("You are driving at night and there is no other traffic around you. When can you use your headlights\n" +
                        "on high beam?",
                new String[]{
                        "On any road, even if there are street lights.",
                        "On any road where the speed limit is above 80 km/h.",
                        "Only on roads that do not have street lights.",
                        "0"});

        generalList.add(new String[]{"You want to park your vehicle for a short time. It is night time. You should?", "gk102"});
        answerListForGeneralKnowledge.put("You want to park your vehicle for a short time. It is night time. You should?",
                new String[]{
                        "Pick a visible position or leave the parking\n" +
                                "or hazard lights on.",
                        "Park on the footpath.",
                        "Leave your headlights on high beam.",
                        "0"});

        generalList.add(new String[]{"You drive up to a corner where you see some loose gravel on the road. You should?", "gk103"});
        answerListForGeneralKnowledge.put("You drive up to a corner where you see some loose gravel on the road. You should?",
                new String[]{
                        "Slow down.",
                        "Check the mirrors and change lanes.",
                        "Speed up and drive over the gravel as quickly as possible.",
                        "0"});

        generalList.add(new String[]{"When you are driving on a two-lane freeway, which lane should you choose?", "gk105"});
        answerListForGeneralKnowledge.put("When you are driving on a two-lane freeway, which lane should you choose?",
                new String[]{
                        "The left lane unless you are overtaking.",
                        "Whichever lane has the least traffic..",
                        "The right lane to avoid slow-moving vehicles.",
                        "0"});

        generalList.add(new String[]{"When there are three lanes on a freeway?", ""});
        answerListForGeneralKnowledge.put("When there are three lanes on a freeway?",
                new String[]{
                        "The right lane is reserved for overtaking.",
                        "The right lane is for emergency vehicles only.",
                        "The right lane is for avoiding most traffic.",
                        "0"});

        generalList.add(new String[]{"When you see the headlights flashing on the front of a bus, what should you do?", ""});
        answerListForGeneralKnowledge.put("When you see the headlights flashing on the front of a bus, what should you do?",
                new String[]{
                        "Be careful, there may be children about.",
                        "Drive past the bus only while the lights are flashing.",
                        "Stop and wait for the lights to stop flashing.",
                        "0"});

        generalList.add(new String[]{"You are driving your vehicle along a street and want to stop for\n" +
                "a short time. Are you allowed to double park your vehicle (that\n" +
                "is stand it on the road alongside a parked car)?", "gk112"});
        answerListForGeneralKnowledge.put("You are driving your vehicle along a street and want to stop for\n" +
                        "a short time. Are you allowed to double park your vehicle (that\n" +
                        "is stand it on the road alongside a parked car)?",
                new String[]{
                        "No, never.",
                        "Yes, provided you do not leave the vehicle.",
                        "Yes, provided you stop for a short time only and turn on your hazard warning lights.",
                        "0"});

        generalList.add(new String[]{"Looking at the diagrams, how far from the approach\n" +
                "side of a bus stop or a railway crossing are you allowed\n" +
                "to stand or park your vehicle?", "gk113"});
        answerListForGeneralKnowledge.put("Looking at the diagrams, how far from the approach\n" +
                        "side of a bus stop or a railway crossing are you allowed\n" +
                        "to stand or park your vehicle?",
                new String[]{
                        "At least 20 metres.",
                        "At least 50 metres.",
                        "At least 5 metres.",
                        "0"});

        generalList.add(new String[]{"Are you allowed to use a hand-held mobile phone while driving a car?", ""});
        answerListForGeneralKnowledge.put("Are you allowed to use a hand-held mobile phone while driving a car?   ",
                new String[]{
                        "No.",
                        "Yes, but only when you stop at intersections.",
                        "Yes, but you must hold the steering wheel with at least one hand.",
                        "0"});

        generalList.add(new String[]{"Are you required to carry your driver’s licence with you every time you drive?", ""});
        answerListForGeneralKnowledge.put("Are you required to carry your driver’s licence with you every time you drive?",
                new String[]{
                        "Yes.",
                        "No it is only needed on long trips.",
                        "No, being licensed is enough.",
                        "0"});

        generalList.add(new String[]{"Bicycle and motorcycle riders have the same rights to use the road as other motor vehicle\n" +
                "drivers. They are, however, more at risk in traffic because?", ""});
        answerListForGeneralKnowledge.put("Bicycle and motorcycle riders have the same rights to use the road as other motor vehicle\n" +
                        "drivers. They are, however, more at risk in traffic because?",
                new String[]{
                        "They are harder to see in traffic and do not have the same protection as\n" +
                                "many drivers.",
                        "They are careless and do not obey road rules.",
                        "They ride too fast and do not turn their lights on.",
                        "0"});

        generalList.add(new String[]{"To drive safely, you need to concentrate and be able to monitor everything that is\n" +
                "happening on the road. To do this, you need to?", ""});
        answerListForGeneralKnowledge.put("To drive safely, you need to concentrate and be able to monitor everything that is\n" +
                        "happening on the road. To do this, you need to?",
                new String[]{
                        "Continually scan the road, looking ahead, to the sides, checking side\n" +
                                "and rear mirrors and anticipate what may happen.",
                        "Turn all your attention only to the road ahead.",
                        "Ask other occupants in the vehicle to watch out for possible dangers.",
                        "0"});

        generalList.add(new String[]{"If you are driving towards a road works zone and a traffic controller displays a stop sign\n" +
                "you must?", ""});
        answerListForGeneralKnowledge.put("If you are driving towards a road works zone and a traffic controller displays a stop sign\n" +
                        "you must?",
                new String[]{
                        "Stop your vehicle and follow the directions of the traffic controller.",
                        "Stop and then proceed if you think it is safe.",
                        "Slow down and continue through the road works zone.",
                        "0"});

        generalList.add(new String[]{"If you are driving through a road work zone in the left\n" +
                "hand lane and you see this sign you should?", "gk119"});
        answerListForGeneralKnowledge.put("If you are driving through a road work zone in the left\n" +
                        "hand lane and you see this sign you should?",
                new String[]{
                        "Merge to the right and give way to other\n" +
                                "traffic..",
                        "Speed up to get in front of any cars traveling in\n" +
                                "the right hand lane.",
                        "Stop and wait for directions.",
                        "0"});

        generalList.add(new String[]{"Where must L or P plates be displayed on a vehicle?", ""});
        answerListForGeneralKnowledge.put("Where must L or P plates be displayed on a vehicle?",
                new String[]{
                        "On the front and back of the exterior of the vehicle.",
                        "Anywhere including on the dashboard.",
                        "Anywhere inside the windows but only if they are not tinted.",
                        "0"});

        generalList.add(new String[]{"When displaying L or P plates, how much of the letter must be clearly visible?", ""});
        answerListForGeneralKnowledge.put("When displaying L or P plates, how much of the letter must be clearly visible?",
                new String[]{
                        "All of the letter L or P.",
                        "Only enough of the letter so it is clear whether it is an L or P.",
                        "Most of the letter.",
                        "0"});

        generalList.add(new String[]{"Do bicycle riders have the same rights and responsibilities as drivers and motorcycle\n" +
                "riders?", ""});
        answerListForGeneralKnowledge.put("Do bicycle riders have the same rights and responsibilities as drivers and motorcycle\n" +
                        "riders?",
                new String[]{
                        "Yes.",
                        "No, they must always ride on the footpath.",
                        "No, they must give way to cars at all times when riding on the road.",
                        "0"});

        generalList.add(new String[]{"Before getting out of your vehicle you must?", ""});
        answerListForGeneralKnowledge.put("Do bicycle riders have the same rights and responsibilities as drivers and motorcycle\n" +
                        "riders?",
                new String[]{
                        "Check your mirrors and blind spots for pedestrians, bicycles or other\n" +
                                "vehicles.",
                        "Check your seatbelt is back in place.",
                        "Check your headlights are turned off.",
                        "0"});
    }

    public static void initializationTrafficSignsSection() {

        trafficSignsSection = new ArrayList<>();
        answerListForTrafficSignsSections = new HashMap<>();

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si001"});
        answerListForTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Not drive beyond the sign.",
                        "Drive with caution.",
                        "Not pass another vehicle.",
                        "0"});

        trafficSignsSection.add(new String[]{"This sign means you should?", "si002"});
        answerListForTrafficSignsSections.put("This sign means you should?",
                new String[]{
                        "Pass to the left of the sign.",
                        "Turn left at next street.",
                        "Drive carefully, roundabout ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si003"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "All right lane traffic must turn right at the next intersection.",
                        "Right lane traffic may turn right or go straight ahead at the\n" +
                                "next intersection.",
                        "One way traffic ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si004"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Traffic travels in each direction.",
                        "No turns permitted.",
                        "Double lane bridge ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si006 "});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You must not turn to the right.",
                        "You may turn to the right.",
                        "You must give way to traffic on your right.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si007"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You must not turn to the left.",
                        "You must not turn to the left or the right.",
                        "You must not turn to the right.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si008"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "All traffic must travel in the direction of the arrow.",
                        "Follow the arrow unless you are turning right.",
                        "Road curves to the left ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si009"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You may travel only in the direction in which the arrow is pointing.",
                        "No left turn.",
                        "One lane bridge ahead, slow down.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si013"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You are not to exceed 60 km/h.",
                        "You can go faster than 60 km/h.",
                        "You are on Highway 60.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si014"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "You must not drive faster than 100 km/h.",
                        "You must drive faster than 100 km/h.",
                        "The sign applies to truck drivers only, cars can travel at any speed.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si016"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Drive carefully, and watch out for kangaroos\n" +
                                "entering the road for the next 30 km.",
                        "Zoo 30 km ahead.",
                        "Nature reserve 30 km ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si017"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "T-intersection ahead. If you are on the\n" +
                                "terminating road, you must give way to all\n" +
                                "vehicles approaching from your right or left.",
                        "No through road ahead, slow down.",
                        "Tollway ahead, be prepared to stop and pay toll.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you?", "si018"});
        answerListForTrafficSignsSections.put("When you see this sign you?",
                new String[]{
                        "Must not stop your vehicle at the kerb during the\n" +
                                "times shown.",
                        "Must not stop here at any time.",
                        "May stop at any time to pick up or drop off passengers.",
                        "0"});

        trafficSignsSection.add(new String[]{"You are most likely to find this sign?", "si019"});
        answerListForTrafficSignsSections.put("You are most likely to find this sign?",
                new String[]{
                        "On the approach to a bridge which has room for\n" +
                                "only two vehicles, slow down and proceed with\n" +
                                "caution.",
                        "When a bridge is not safe to drive on.",
                        "If there is a footbridge for pedestrians ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si020"});
        answerListForTrafficSignsSections.put("What does this sign mean??",
                new String[]{
                        "Road may be slippery when wet, slow down and\n" +
                                "drive carefully.",
                        "Sharp turns in the road ahead.",
                        "Road under repair, drive carefully.",
                        "0"});

        trafficSignsSection.add(new String[]{"You are most likely to find this sign?", "si021"});
        answerListForTrafficSignsSections.put("You are most likely to find this sign?",
                new String[]{
                        "As you approach a winding road, slow down and\n" +
                                "drive with caution.",
                        "If there is a steep hill ahead.",
                        "If an unsealed road is ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si022"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "A sharp depression in the road is ahead, be\n" +
                                "prepared, slow down.",
                        "Do not drive with your lights on high beam.",
                        "Police station ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si024"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Sharp bend to the right ahead, slow down and\n" +
                                "drive carefully.",
                        "Turn around and go back, you are going the wrong way.",
                        "No right turn allowed.",
                        "0"});

        trafficSignsSection.add(new String[]{"You are most likely to find this sign, where?", "si025"});
        answerListForTrafficSignsSections.put("You are most likely to find this sign, where?",
                new String[]{
                        "Children may be crossing the road ahead, slow\n" +
                                "down and be prepared to make a safe stop.",
                        "There is an athletic field ahead.",
                        "Pedestrians are not allowed.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si026"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Crossroads ahead, reduce your speed and watch\n" +
                                "out for other traffic and pedestrians.",
                        "Hospital ahead, drive carefully.",
                        "Cemetery ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"If the red lights on this sign are flashing what are" +
                " you required to do?", "si027"});
        answerListForTrafficSignsSections.put("If the red lights on this sign are flashing what are you required\n" +
                        "to do?",
                new String[]{
                        "Stop until red lights stop flashing then drive on if\n" +
                                "it is safe to do so.",
                        "Slow down and drive carefully over the crossing if you\n" +
                                "cannot see a train approaching.",
                        "Stop until train has passed then proceed immediately.",
                        "0"});

        trafficSignsSection.add(new String[]{"You should expect this sign, if?", "si028"});
        answerListForTrafficSignsSections.put("You should expect this sign, if?",
                new String[]{
                        "A give way sign at an intersection is ahead, slow\n" +
                                "down and be prepared to stop.",
                        "You are approaching a school or playground.",
                        "You are approaching an intersection with traffic lights, be\n" +
                                "prepared to stop.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si030"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down and beware of trucks entering from\n" +
                                "the side.",
                        "Trucks must use low gear.",
                        "Heavy vehicle checking station ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si031"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down and look out for pedestrians crossing\n" +
                                "the road ahead.",
                        "Stop and help aged pedestrians across the road.",
                        "Hospital ahead, slow down and proceed with caution.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si032"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Pedestrian crossing ahead, slow down and be\n" +
                                "prepared to stop.",
                        "Overhead footbridge for pedestrians ahead.",
                        "Joggers ahead, drive carefully.",
                        "0"});

        trafficSignsSection.add(new String[]{"You should expect this sign?", "si033"});
        answerListForTrafficSignsSections.put("You should expect this sign?",
                new String[]{
                        "When a divided road ends and two way traffic is\n" +
                                "ahead.",
                        "If a one way street is ahead.",
                        "If a one lane bridge is ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si035"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Workers ahead, slow down and be prepared to\n" +
                                "stop.",
                        "Children's playground ahead, slow down and be prepared\n" +
                                "to stop.",
                        "Do not litter. ",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si036"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Watch out for bicycle riders along the roadway or\n" +
                                "when turning.",
                        "Bicycle riders not allowed on the roadway.",
                        "You are approaching a children's playground, slow down.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si038"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "If traffic lights are out of order or the amber light\n" +
                                "is flashing, you must stop and give way to traffic\n" +
                                "as if you are at an intersection with stop signs.",
                        "Stop, red light camera in operation.",
                        "Stop at all times and give way to all traffic.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si039"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Stop sign ahead, slow down and prepare to stop.",
                        "You are approaching a roundabout, prepare to give way.",
                        "One way traffic ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si040"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Traffic controller ahead, slow down and be\n" +
                                "prepared to stop.",
                        "School children crossing the road ahead, prepare to stop.",
                        "Traffic lights out of order, Police on duty ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si041"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Steep down-grade in the road ahead, slow down.",
                        "Road ahead slippery when wet, drive carefully.",
                        "Road under repair, slow down.",
                        "0"});

        trafficSignsSection.add(new String[]{"You should expect this sign, when?", "si042"});
        answerListForTrafficSignsSections.put("You should expect this sign, when?",
                new String[]{
                        "A divided road is ahead, prepare for a change in\n" +
                                "traffic conditions.",
                        "A two lane bridge is ahead, slow down and drive carefully.",
                        "Freeway conditions are ahead, maximum speed is 100\n" +
                                "km/h.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si043"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Railway level crossing with flashing signals\n" +
                                "ahead, slow down, drive carefully, and be\n" +
                                "prepared to stop.",
                        "Intersection ahead with traffic lights, prepare to stop.",
                        "Red light camera in use at traffic lights ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si045"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Road narrows ahead, slow down and prepare for\n" +
                                "a change in traffic conditions.",
                        "Form one lane of traffic.",
                        "Merging traffic, give way to your right.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si045"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Vehicles are not allowed to stop at the kerb\n" +
                                "except in a medical emergency.",
                        "Vehicles must not stop at the kerb, except if picking up a\n" +
                                "passenger.",
                        "Vehicles must not stop at the kerb, unless picking up\n" +
                                "goods.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si048"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Vehicles carrying three or more people, and\n" +
                                "motorcycles may use this lane.",
                        "Motor cars carrying one passenger may use this lane.",
                        "This lane is reserved for bicycle riders only.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si049"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Railway level crossing ahead, slow down and\n" +
                                "look out for trains, be prepared to stop.",
                        "Cattle or sheep crossing the road ahead, drive slowly.",
                        "Give way sign ahead, slow down and be prepared to stop.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign, you should?", "si050"});
        answerListForTrafficSignsSections.put("When you see this sign, you should?",
                new String[]{
                        "Drive carefully and watch out for traffic entering\n" +
                                "from a side-road intersection ahead.",
                        "Take care, trucks crossing the road ahead.",
                        "Take a break, rest area ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you must?", "si051"});
        answerListForTrafficSignsSections.put("When you see this sign you must?",
                new String[]{
                        "Stop at the stop line and give way to all traffic.",
                        "Stop at the stop line and give way to all traffic on your right\n" +
                                "only.",
                        "Slow down and be prepared to stop only if there is any\n" +
                                "danger of a collision with another vehicle or pedestrian.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you must?", "si052"});
        answerListForTrafficSignsSections.put("When you see this sign you must?",
                new String[]{
                        "Slow down and be prepared to stop and give way to\n" +
                                "all traffic if there is any danger of a collision.",
                        "Stop and give way to all traffic even if the intersection is clear.",
                        "Slow down and be prepared to give way to traffic on your\n" +
                                "right only, if there is any danger of a collision.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si053"});
        answerListForTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Come to a complete stop, look both ways for trains\n" +
                                "and proceed with caution if no trains are approaching.",
                        "Slow down, then drive slowly over the crossing looking both\n" +
                                "ways for trains.",
                        "Stop, only if a train is at the crossing.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si056"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down, the maximum safe speed around the\n" +
                                "next curve in the road is 35km/h.",
                        "Winding road ahead for next 35 km.",
                        "Next main town 35 km to the right.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si057"});
        answerListForTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Slow down and be prepared to stop if the lights\n" +
                                "start flashing, warning you of an approaching train.",
                        "Continue at the same speed and not look both ways for\n" +
                                "approaching trains.",
                        "Stop in the middle of the railway tracks and look both ways\n" +
                                "for approaching trains",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign means?", "si058"});
        answerListForTrafficSignsSections.put("What does this sign means?",
                new String[]{
                        "You must stay in or move to the left lane, unless you are\n" +
                                "overtaking another vehicle.",
                        "You must stay in the left lane and must not overtake any vehicles.",
                        "You can overtake vehicles only on the left side.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign, what must you do?", "si059"});
        answerListForTrafficSignsSections.put("When you see this sign, what must you do?",
                new String[]{
                        "Slow down and be ready to stop and give way to a train.",
                        "Stop before the railway crossing, wait for 1 minute and proceed if the\n" +
                                "crossing is clear.",
                        "Drive quickly over the railway crossing.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si060"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Slow down, be ready to stop and give way to all vehicles\n" +
                                "already on the roundabout if there is a danger of a\n" +
                                "collision.",
                        "All traffic must turn back at the roundabout.",
                        "Stop at all times and give way to all traffic on your right.",
                        "0"});

        trafficSignsSection.add(new String[]{"When you see this sign you should?", "si061"});
        answerListForTrafficSignsSections.put("When you see this sign you should?",
                new String[]{
                        "Drive carefully, you are reaching the top of the hill and\n" +
                                "will not be able to see a safe distance in front of you.",
                        "Watch out, the road ahead may be flooded.",
                        "Slow down, there is a dangerous curve ahead.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si062"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "There is a hump (sudden slope up and down) in the road\n" +
                                "ahead, slow down.",
                        "There is a tunnel ahead, turn on your headlights.",
                        "The road ahead is closed, go back.",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign tell you?", "si063"});
        answerListForTrafficSignsSections.put("What does this sign tell you?",
                new String[]{
                        "There may be animals on or near the road ahead,\n" +
                                "slow down and be prepared to stop to avoid collision.",
                        "Animals are crossing the road ahead, stop and wait for\n" +
                                "directions.",
                        "You are approaching an animal farm.    ",
                        "0"});

        trafficSignsSection.add(new String[]{"What does this sign mean?", "si064"});
        answerListForTrafficSignsSections.put("What does this sign mean?",
                new String[]{
                        "Only vehicles carrying a disable person and\n" +
                                "displaying a mobility parking authority may park in\n" +
                                "this area.",
                        "Motorcyclists may park in this area.",
                        "Vehicles may park in this area for up to ten minutes.",
                        "0"});


    }

    private static void initializeIntersection() {
        intersection = new ArrayList<>();
        intersectionAnswers = new HashMap<>();


        intersection.add(new String[]{"As you approach an intersection, you should check for" +
                " traffic on your left and right -", ""});
        intersectionAnswers.put("As you approach an intersection, you should check for" +
                " traffic on your left and right -", new String[]{"Only when the traffic is heavy.",
                "Only when you approach a stop sign.", "At all times before entering the intersection.", "2"});


        intersection.add(new String[]{"When making a right-hand turn at the intersection shown," +
                " you must give way to -", "intersection_right"});
        intersectionAnswers.put("When making a right-hand turn at the intersection shown," +
                " you must give way to -", new String[]{"An oncoming vehicle going straight " +
                "ahead or turning left and any vehicle on " + "your right.", "A vehicle approaching from your left and " +
                "intending to turn right.", "Only pedestrians.", "0"});


        intersection.add(new String[]{"If turning right at a T-intersection (as shown) must you give way to vehicles approaching from both " +
                "the left and right?", "intersection_t"});
        intersectionAnswers.put("If turning right at a T-intersection (as shown) must you give way to vehicles approaching from both " +
                "the left and right?", new String[]{"No, but you must give way if turning.",
                "Yes, it has the same meaning as the sign itself.", "No, you only need to give way to the" +
                " vehicle on your right.", "1"});

        intersection.add(new String[]{"If turning at an intersection are you required to give way" +
                " to pedestrians?", "intersection_both"});
        intersectionAnswers.put("If turning at an intersection are you required to give way " +
                "to pedestrians?", new String[]{"Yes, only if turning left.", "Yes, a driver turning right or left must " +
                "give way to pedestrians, if there is a danger of a collision",
                "Yes, only if turning right.", "1"});


        intersection.add(new String[]{"When you come to an intersection and the road beyond is choked with vehicles going in the same " +
                "direction, what should you do?", "one_direction_intersection"});
        intersectionAnswers.put("When you come to an intersection and the road beyond is choked with vehicles going in the same " +
                        "direction, what should you do?",
                new String[]{"Wait until there is room for you to " +
                        "completely cross the intersection.", "Proceed if there is no traffic on your right.",
                        "Travel into the intersection and wait until " +
                                "traffic ahead moves.", "0"});

        intersection.add(new String[]{"Right-turns must be made from which lanes when travelling" +
                " on a laned roadway?", ""});
        intersectionAnswers.put("Right-turns must be made from which lanes when travelling " +
                "on a laned roadway?", new String[]{"The lane carrying the least amount of traffic.",
                "The far left-hand lane.", "The far right-hand lane or any other lane having an arrow pointing " +
                "right.", "2"});

        intersection.add(new String[]{"In this diagram both vehicles O and P must pass through GIVE WAY signs before entering the " +
                "intersection. Which vehicle goes first?", "intersection_o_p"});
        intersectionAnswers.put("In this diagram both vehicles O and P must pass through GIVE WAY signs before entering the " +
                        "intersection. Which vehicle goes first?",
                new String[]{"Vehicle O.", "Vehicle P.", "It depends on who moves first.", "1"});

        intersection.add(new String[]{"Vehicle O is at a STOP sign -", "intersection_o_p_q_r"});
        intersectionAnswers.put("Vehicle O is at a STOP sign -",
                new String[]{" Vehicle O must give way only to vehicle R.",
                        "Vehicle O must give way to vehicles P, Q and R.",
                        "All vehicles must give way to vehicle O", "1"});


        intersection.add(new String[]{"If both vehicles P and O in the diagram are turning right, which vehicle is in the best position to turn " +
                "left into the street marked 'X'?", "intersection_pink"});
        intersectionAnswers.put("If both vehicles P and O in the diagram are turning right, which vehicle is in the best position to turn " +
                "left into the street marked 'X'?", new String[]{"Vehicle P.", "Neither vehicle.",
                "Vehicle O.", "2"});


        intersection.add(new String[]{"The diagram shows a marked pedestrian crossing at an intersection. There is also a STOP sign at " +
                "the intersection. You have already stopped for a pedestrian. Must you stop again at the STOP line?"
                , "intersection_stop"});
        intersectionAnswers.put("The diagram shows a marked pedestrian crossing at an intersection. There is also a STOP sign at " +
                "the intersection. You have already stopped for a pedestrian. Must you stop again " +
                "at the STOP line?", new String[]{"Yes, if there is traffic on your right only.",
                "Yes, at all times.", "No, if the intersection is clear.", "1"});


        intersection.add(new String[]{"A GIVE WAY sign at an intersection means that you must -",
                "intersection_give_way"});
        intersectionAnswers.put("A GIVE WAY sign at an intersection means that you must -",
                new String[]{"Be ready to stop and give way to all " +
                        "other traffic if there is danger of a " +
                        "collision.", "Stop completely at all times and have no right " +
                        "of way.", "Slow down and only give way to traffic on your " +
                        "right.", "0"});

        intersection.add(new String[]{"Which vehicle in the diagram must give way?", "give_way_j_k_l"});
        intersectionAnswers.put("Which vehicle in the diagram must give way?",
                new String[]{"Vehicle J.", "Vehicle K.", "Vehicle L.", "0"});

        intersection.add(new String[]{"You want to make a left turn. You must use your" +
                " left-hand indicator -", ""});
        intersectionAnswers.put("You want to make a left turn. You must use your left-hand indicator -",
                new String[]{"Only when there is traffic behind you.", "At all times.",
                        "Only when arrows are marked on the roadway.", "1"});

        intersection.add(new String[]{"At the T-intersection shown in the diagram which vehicle" +
                " should give way?", "intersection_r_q"});
        intersectionAnswers.put("At the T-intersection shown in the diagram which vehicle should give way?",
                new String[]{"Vehicle Q.", "Whichever vehicle got there last.", "Vehicle R.", "2"});

        intersection.add(new String[]{"You wish to make a right-hand turn from a ONE WAY STREET with no arrows marked on the " +
                "roadway. You should position your vehicle -", ""});
        intersectionAnswers.put("You wish to make a right-hand turn from a ONE WAY STREET with no arrows marked on the " +
                "roadway. You should position your vehicle -", new String[]{"On the right-hand side of the street.",
                "In the middle of the street.", "On the left-hand side of the street.", "0"});


        intersection.add(new String[]{"When there are no arrows marked on the road, left turns" +
                " must be made from -", ""});
        intersectionAnswers.put("When there are no arrows marked on the road, left turns must be made from -",
                new String[]{"The middle of the road.", "Either side of the road.",
                        "The far left-hand side of the road.", "2"});

        intersection.add(new String[]{"What should you do on approaching a railway level crossing" +
                " displaying a STOP sign?", "intersection_rail"});
        intersectionAnswers.put("What should you do on approaching a railway level crossing" +
                " displaying a STOP sign?", new String[]{"Stop at all times and proceed when safe to do so.",
                "Slow down to 10 km/h, then proceed through the crossing.",
                "Stop, only if a train is at the crossing.", "0"});

        intersection.add(new String[]{"You are driving the car in the diagram. You must stop -",
                "intersection_must_stop"});
        intersectionAnswers.put("You are driving the car in the diagram. You must stop -",
                new String[]{"Even when there is no other traffic.",
                        "Only if there is a car on your right or left.",
                        "Only if there is danger of a collision with " +
                                "another vehicle.", "0"});

        intersection.add(new String[]{"If the boomgates are down and the signals are flashing," +
                " at a railway level crossing, you may begin to cross -", ""});
        intersectionAnswers.put("If the boomgates are down and the signals are flashing," +
                        " at a railway level crossing, you may begin to cross -",
                new String[]{"If you cannot see a train approaching.",
                        "If you can safely go around the closed gate.",
                        "Only when the gate is up and the lights stop flashing.", "2"});

        intersection.add(new String[]{"When approaching a railway level crossing displaying" +
                " this sign, you must -", "intersection_rail_two_tracks"});
        intersectionAnswers.put("When approaching a railway level crossing displaying this sign," +
                " you must -", new String[]{"Increase your speed to avoid any approaching trains.",
                "Slow down, look both ways for trains and be " +
                        "prepared to stop if necessary.", "Continue across at normal speed, do not slow down.",
                "1"});


        intersection.add(new String[]{"Even if the signal at a railway level crossing does not" +
                " indicate that a train is coming, you should -", "intersection_stop_on_red_signal"});
        intersectionAnswers.put("Even if the signal at a railway level crossing does not indicate " +
                "that a train is coming, you should -", new String[]{"Speed up and cross the tracks quickly.",
                "Stop completely at all times.", "Slow down, be ready to stop and give way if " +
                "there is danger of collision.", "2"});


        intersection.add(new String[]{"You come to an intersection in Sydney with a Light Rail " +
                "vehicle about to enter. What should you do?", "intersection_train"});
        intersectionAnswers.put("You come to an intersection in Sydney with a Light Rail" +
                " vehicle about to enter. What should you do?", new String[]{
                "Wait until the intersection is clear.", "Enter the intersection, but keep away" +
                " from the Light Rail vehicle.", "Change lanes before crossing the intersection.",
                "0"
        });


        intersection.add(new String[]{"You approach an intersection in busy traffic and want to go " +
                "straight ahead. The traffic lights turn " +
                "green. When are you permitted to enter the intersection?", "intersection_white_car_circule"});
        intersectionAnswers.put("You approach an intersection in busy traffic and want to go " +
                "straight ahead. The traffic lights turn " +
                "green. When are you permitted to enter the intersection?", new String[]{"Only when there is room for your vehicle on " +
                "the other side.", "Immediately after the traffic lights turn green.",
                "When the vehicle behind signals you to go.", "0"});


        intersection.add(new String[]{"You are at a busy intersection with slow moving traffic and" +
                " want to go straight ahead. When the traffic lights change to green you should " +
                "make sure that -", "intersection_thirty_seven"});
        intersectionAnswers.put("You are at a busy intersection with slow moving traffic and want" +
                " to go straight ahead. When the " +
                "traffic lights change to green you should make sure that -", new String[]{
                "You have the car in the right gear.", "You do not block the intersection.",
                "You do not hold up the traffic behind you.", "1"
        });


        intersection.add(new String[]{"The traffic on the other side of this intersection has" +
                " stopped. You are in the car shown and want to " +
                "cross the intersection. The lights are green. What should you do?", "intersection" +
                "_black_yellow_circle"});
        intersectionAnswers.put("The traffic on the other side of this intersection has stopped. " +
                        "You are in the car shown and want to " +
                        "cross the intersection. The lights are green. What should you do?",
                new String[]{"Wait until there is enough room for your " +
                        "vehicle to cross the intersection completely.",
                        "Drive through the intersection slowly and hope that it " +
                                "will clear before the lights change.",
                        "Drive into the intersection and then turn left.", "0"});


        intersection.add(new String[]{"Which statement is correct?", ""});
        intersectionAnswers.put("Which statement is correct?",
                new String[]{"Red light cameras take photographs of vehicles that speed through" +
                        " intersections.", "Red light cameras take photographs of vehicles that " +
                        "cross intersections when the " +
                        "lights are yellow.", "Red light cameras take photographs of vehicles that enter " +
                        "intersections when the lights are red.", "2"});


        intersection.add(new String[]{"As you drive into an intersection," +
                " the lights turn to yellow. You should -", "intersection_yellow"});
        intersectionAnswers.put("As you drive into an intersection, the lights turn to yellow. You should -",
                new String[]{"Continue through the intersection.", "Accelerate as hard as you can.",
                        "Brake immediately to a stop.", "0"});


        intersection.add(new String[]{"When these lights are flashing it means -",
                "intersection_dont_walk"});
        intersectionAnswers.put("When these lights are flashing it means -",
                new String[]{"Pedestrians who have started crossing must go back to " +
                        "the footpath.", "`",
                        "Pedestrians must not start to cross.", "2"});


        intersection.add(new String[]{"You wish to turn left here. The pedestrian lights are flashing " +
                "red. You should -", "intersection_padestrian"});
        intersectionAnswers.put("You wish to turn left here. The pedestrian lights are flashing red." +
                        " You should -",
                new String[]{"Move into the right hand lane.", "Slowly move through the intersection turning " +
                        "left.", "Give way to pedestrians still " +
                        "crossing.", "2"});

        intersection.add(new String[]{"You drive up to an intersection with a stop sign. There is no painted stop line. Where should you " +
                "stop?", "intersection_stop_sign"});
        intersectionAnswers.put("You drive up to an intersection with a stop sign. There is no painted stop line. Where should you " +
                "stop?", new String[]{"Before coming to and as near to the intersection as " +
                "possible.", "At least five metres before the intersection.",
                "At the point where you can see clearly in both directions.", "0"});


        intersection.add(new String[]{"You drive up to an intersection with a stop sign in the car marked A and you wish to turn right. The " +
                "car marked B facing you also has a stop sign and is indicating to turn left." +
                " Who can go first?", "intersection_who_goes_first"});
        intersectionAnswers.put("You drive up to an intersection with a stop sign in the car marked A and you wish to turn right. The " +
                "car marked B facing you also has a stop sign and is indicating to turn left." +
                " Who can go first?", new String[]{"Whoever arrives at the intersection first.",
                "Car B.", "Car A.", "1"});


        intersection.add(new String[]{"This intersection does not have any traffic lights or signs. You are in car A and want to turn right. " +
                "When can you go?", "intersection_turn_right"});
        intersectionAnswers.put("This intersection does not have any traffic lights or signs. You are in car A and want to turn right. " +
                "When can you go?", new String[]{"After the car going straight ahead " +
                "has passed.", "As soon as you get to the intersection.",
                "After the car going straight ahead has passed.", "0"});

        intersection.add(new String[]{"At this intersection there are no signs or traffic lights." +
                " You are in the car marked A. You want to turn left. What should you do?",
                "intersection_give_way_car_b"
        });
        intersectionAnswers.put("At this intersection there are no signs or traffic lights." +
                " You are in the car marked A. You want to " +
                "turn left. What should you do?", new String[]{"Enter the intersection and make" +
                " the turn.", "Slow down and give way to car B on " +
                "your right.", "Sound the horn to warn the other driver.", "1"});

        intersection.add(new String[]{"You are in car A and want to turn right at this intersection. Car B facing you is also indicating to " +
                "turn right. What path should you take?", "intersection_opposite_cars"});
        intersectionAnswers.put("You are in car A and want to turn right at this intersection. Car B facing you is also indicating to " +
                        "turn right. What path should you take?",
                new String[]{"Both pass in front of each other.", "Pass behind each other."
                        , "Choose either depending on the traffic.", "0"});

        intersection.add(new String[]{"When police officers are at intersections giving directions" +
                " you must -", ""});
        intersectionAnswers.put("When police officers are at intersections giving directions you must -",
                new String[]{"Drive through the intersection as you normally would.",
                        "Wait for the traffic lights to start working again.",
                        "Always follow any instruction they give you.", "2"});

        intersection.add(new String[]{"You are in car A and are going straight ahead through the" +
                " intersection. Who should give way?", "intersection_same_way"});
        intersectionAnswers.put("You are in car A and are going straight ahead through the" +
                " intersection. Who should give way?", new String[]{"Whoever gets to the " +
                "intersection first.", "Car B.", "Car A.", "1"});


        intersection.add(new String[]{"You wish to turn left at this roundabout. " +
                "Which lane may you use?", "intersection_left_right_lane"});
        intersectionAnswers.put("You wish to turn left at this roundabout." +
                " Which lane may you use?", new String[]{"Either lane.", "Right lane.",
                "Left lane.", "2"});


        intersection.add(new String[]{"You are in the right hand lane and are planning to go " +
                "straight ahead through this roundabout. " +
                "When should you signal left to exit the roundabout?", "intersection_o_n_m"});
        intersectionAnswers.put("You are in the right hand lane and are planning to go straight " +
                        "ahead through this roundabout. " +
                        "When should you signal left to exit the roundabout?",
                new String[]{"After point O.", "After point N.", "After point M.", "0"});

        intersection.add(new String[]{"When you wish to turn left at a roundabout you indicate -",
                "intersection_zebra"});
        intersectionAnswers.put("When you wish to turn left at a roundabout you indicate -",
                new String[]{"Only if you think it necessary.", "Left from start to finish."
                        , "Left only after you enter the roundabout.", "1"});

        intersection.add(new String[]{"You wish to go straight ahead at this roundabout. Which" +
                " statement is true?", "intersection_bike"});
        intersectionAnswers.put("You wish to go straight ahead at this roundabout. Which statement" +
                " is true?", new String[]{"You must enter in the right lane and leave in the left.",
                "You must always leave the roundabout in the left lane",
                "You must leave the roundabout in the same lane as you entered.", "2"});


        intersection.add(new String[]{"You want to turn left at this roundabout." +
                " Which lane must you use?", "intersection_a_b"});
        intersectionAnswers.put("You want to turn left at this roundabout." +
                " Which lane must you use?", new String[]{"Lane A.", "Lane B.",
                "Either lane.", "0"});

        intersection.add(new String[]{"When you wish to drive straight ahead at a roundabout" +
                " you may enter from either the left or right " +
                "lane. As you continue around you should -", "intersection_straight_right"});
        intersectionAnswers.put("When you wish to drive straight ahead at a roundabout you may" +
                        " enter from either the left or right " +
                        "lane. As you continue around you should -",
                new String[]{"Move into another lane with least traffic.", "Keep in the lane you entered the " +
                        "roundabout.", "Change lanes to get through quickly.", "1"});


        intersection.add(new String[]{"When turning left at a roundabout you should enter and" +
                " leave the roundabout -", "intersection_multi_cars"});
        intersectionAnswers.put("When turning left at a roundabout you should enter and" +
                " leave the roundabout -", new String[]{"In the left lane.", "In the right lane.",
                "In the lane with least traffic.", "0"});


        intersection.add(new String[]{"You wish to go straight ahead on this roundabout with two" +
                " lanes. Which lane may you use?", "intersection_lane"});
        intersectionAnswers.put("You wish to go straight ahead on this roundabout with two lanes." +
                " Which lane may you use?", new String[]{"Either lane.", "Left lane only.",
                "Right lane only.", "0"
        });


        intersection.add(new String[]{"The motorcyclist wants to travel straight ahead through this " +
                "roundabout. The rider should watch " +
                "out for the marked car because the car -", "intersection_motorcyclist"});
        intersectionAnswers.put("The motorcyclist wants to travel straight ahead through this roundabout. The rider should watch " +
                "out for the marked car because the car -", new String[]{"Could be going too fast.",
                "May stop suddenly.", "May be leaving the roundabout.", "2"});


        intersection.add(new String[]{"To turn back into the same road from which you joined this" +
                " roundabout you must -", "intersection_u_turn"});
        intersectionAnswers.put("To turn back into the same road from which you joined this" +
                " roundabout you must -", new String[]{"Move into the left lane to leave the " +
                "roundabout.", "Stay in the right lane all the way " +
                "round.", "Use the left lane all the way round.", "1"});

        intersection.add(new String[]{"In this roundabout with two lanes, can the marked car turn " +
                "right?", "intersection_round_about"});
        intersectionAnswers.put("In this roundabout with two lanes, can the marked car turn " +
                "right?", new String[]{"No, not at any time.", "Yes, at any time.",
                "Yes, after changing to the right hand lane.", "0"});


        intersection.add(new String[]{"The red car wants to turn right and exit the roundabout in the " +
                "street indicated by an arrow. Is the car positioned in the correct " +
                "lane to do this?", "intersection_red_car"});
        intersectionAnswers.put("The red car wants to turn right and exit the roundabout in the " +
                "street indicated by an arrow. Is the car positioned in the correct " +
                "lane to do this?", new String[]{"Yes, the car can make the turn only from this lane."
                , "No, the car should enter the roundabout only from the right hand lane.",
                "Yes, the car can make the turn from either the left hand or " +
                        "the right hand lane.", "1"});


        intersection.add(new String[]{"If you enter an intersection that is under the control of a" +
                " traffic controller -", ""});
        intersectionAnswers.put("If you enter an intersection that is under the control of a" +
                " traffic controller -", new String[]{"Follow the directions of the controller.",
                "Sound your horn at the traffic controller and hope they get out of your way.",
                "Stop at the intersection and then proceed slowly.", "0"});


        intersection.add(new String[]{"You are at an intersection and see a pedestrian crossing the road into which you are " +
                "turning. You must -", ""});
        intersectionAnswers.put("You are at an intersection and see a pedestrian crossing the road into which you are " +
                "turning. You must -", new String[]{"Sound your horn to warn the pedestrian to get out of the way.",
                "Swerve around the pedestrian to avoid hitting them.",
                "Give way to the pedestrian.", "2"});
    }

    private static void initilizationPedestrians() {
        pedestrains = new ArrayList<>();
        answerListForPedestrians = new HashMap<>();

        pedestrains.add(new String[]{"You must give way to pedestrians on a marked pedestrian crossing?", ""});
        answerListForPedestrians.put("You must give way to pedestrians on a marked pedestrian crossing?",
                new String[]{"If there is any danger of a collision..",
                        "When they are crossing from your right only.",
                        "When they are crossing from your left only.", "0"});

        pedestrains.add(new String[]{"When approaching a marked pedestrian crossing and no pedestrians are in sight, you should?", "pd002"});
        answerListForPedestrians.put("When approaching a marked pedestrian crossing and no pedestrians are in sight, you should?",
                new String[]{"Slow down and be ready to make a safe\n" +
                        "stop.",
                        "Come to a complete stop before the crossing.",
                        "Go faster, in case a pedestrian steps onto the\n" +
                                "crossing.", "0"});

        pedestrains.add(new String[]{"If elderly people or children are on a pedestrian crossing you will probably need to?", ""});
        answerListForPedestrians.put("If elderly people or children are on a pedestrian crossing you will probably need to?",
                new String[]{"Wait extra time to allow them to cross safely.",
                        "Sound your horn to hurry them up.",
                        "Drive around them so you don't hold up traffic.", "0"});

        pedestrains.add(new String[]{"Which sign painted on the road tells you there is a pedestrian crossing ahead??", "pd004"});
        answerListForPedestrians.put("Which sign painted on the road tells you there is a pedestrian crossing ahead??",
                new String[]{"B.",
                        "A.",
                        "C.", "0"});

        pedestrains.add(new String[]{"A vehicle ahead of you has stopped at a pedestrian crossing. You?", "pd005"});
        answerListForPedestrians.put("A vehicle ahead of you has stopped at a pedestrian crossing. You?",
                new String[]{"Must not overtake the stopped vehicle.",
                        "May overtake the vehicle if there are no\n" +
                                "pedestrians on the crossing.",
                        "May overtake the vehicle provided no cars are\n" +
                                "coming the other way.", "0"});

        pedestrains.add(new String[]{"If you see a School Crossing Supervisor holding a sign like this, you must wait until the children?", "pd006"});
        answerListForPedestrians.put("If you see a School Crossing Supervisor holding a sign like this, you must wait until the children?",
                new String[]{"Are off the crossing and the hand held sign\n" +
                        "is taken away.",
                        "Reach the right-hand side of the crossing.",
                        "Are out of sight.", "0"});

        pedestrains.add(new String[]{"Which one of the following statements is correct? Bicycle riders?", ""});
        answerListForPedestrians.put("Which one of the following statements is correct? Bicycle riders?",
                new String[]{"Must obey the road rules.",
                        "May not travel on heavy traffic roads.",
                        "Must ride against the flow of traffic so they can be seen.", "0"});

        pedestrains.add(new String[]{"When driving near children playing or walking near the edge of the road, you should?", ""});
        answerListForPedestrians.put("When driving near children playing or walking near the edge of the road, you should?",
                new String[]{"Slow down, and be ready to make a safe stop.",
                        "Sound your horn to warn them of your presence.",
                        "Continue at the same speed and drive around them.", "0"});

        pedestrains.add(new String[]{"Pedestrians who are affected by alcohol, are?", ""});
        answerListForPedestrians.put("Pedestrians who are affected by alcohol, are?",
                new String[]{"One of the most common groups involved in road accidents.",
                        "Unlikely to walk near the road and do not require your attention.",
                        "Less dangerous than sober pedestrians because they are more careful after\n" +
                                "drinking.", "0"});

        pedestrains.add(new String[]{"When driving near pedestrian crossings, intersections, or school crossings, you should always?", ""});
        answerListForPedestrians.put("When driving near pedestrian crossings, intersections, or school crossings, you should always?",
                new String[]{"Slow down, watch for pedestrians and be ready to make a safe stop.",
                        "Move into the left lane.",
                        "Keep your eyes on the speedo.", "0"});

        pedestrains.add(new String[]{"When driving in an area where there are many pedestrians (e.g. a bus stop) it is important to?", ""});
        answerListForPedestrians.put("When driving in an area where there are many pedestrians (e.g. a bus stop) it is important to?",
                new String[]{"Slow down and watch for an indication that they will enter the road.",
                        "Put your headlights on high beam so they can see you better.",
                        "Increase your speed to avoid the chance of hitting them.", "0"});

        pedestrains.add(new String[]{"When driving past parked vehicles, which of the following is it most important to do?", ""});
        answerListForPedestrians.put("When driving past parked vehicles, which of the following is it most important to do?",
                new String[]{"Watch for pedestrians, animals and car doors opening.",
                        "Drive in the right-hand lane, if there is one.",
                        "Stay as close as possible to the vehicle in front of you.", "0"});

        pedestrains.add(new String[]{"When driving in wet weather, you should?", ""});
        answerListForPedestrians.put("When driving in wet weather, you should?",
                new String[]{"Watch out for pedestrians, who may hurry and take risks.",
                        "Drive in the middle of the road to avoid splashing pedestrians on the footpath.",
                        "Stop and help aged pedestrians across the road.65 ", "0"});

        pedestrains.add(new String[]{"At a pedestrian crossing with traffic lights, when the amber light starts 'flashing' after the red stop\n" +
                "signal, it means?", "pd015"});
        answerListForPedestrians.put("At a pedestrian crossing with traffic lights, when the amber light starts 'flashing' after the red stop\n" +
                        "signal, it means?",
                new String[]{"You may carefully drive through the\n" +
                        "crossing, if there is no risk of colliding with\n" +
                        "pedestrians.",
                        "The traffic lights are out of order and pedestrians\n" +
                                "must not use the crossing.",
                        "The green light is due. Do not proceed until the\n" +
                                "green light appears.", "0"});

        pedestrains.add(new String[]{"Which statement is true?", "pd016"});
        answerListForPedestrians.put("Which statement is true?",
                new String[]{"You must give way to pedestrians if\n" +
                        "there is any danger of hitting them.",
                        "Pedestrians have no special rights on the\n" +
                                "roads.",
                        "You must give way to pedestrians only at\n" +
                                "marked crossings.", "0"});

        pedestrains.add(new String[]{"You drive towards these people on the road. What should you do?", "pd017"});
        answerListForPedestrians.put("You drive towards these people on the road. What should you do?",
                new String[]{"Stop and give way if there is any\n" +
                        "danger of hitting them.",
                        "Continue at the same speed and sound\n" +
                                "the horn.",
                        "Slow down until they are half way through\n" +
                                "the crossing and drive on.", "0"});

        pedestrains.add(new String[]{"You see these zig-zag markings on the road in front of you. What do they mean?", "pd018"});
        answerListForPedestrians.put("You see these zig-zag markings on the road in front of you. What do they mean?",
                new String[]{"Take care and look out for pedestrians at\n" +
                        "a crossing.",
                        "Look out for animals on the side of the road.",
                        "Be careful because the road ahead is slippery.", "0"});


        pedestrains.add(new String[]{"These markings on the road indicate?", "pd019"});
        answerListForPedestrians.put("These markings on the road indicate?",
                new String[]{"Places where pedestrians have\n" +
                        "special rights.",
                        "Places where you can park.",
                        "Places where special speed limits apply.", "0"});

        pedestrains.add(new String[]{"You approach a person crossing the road. You should?", "pd021"});
        answerListForPedestrians.put("You approach a person crossing the road. You should?",
                new String[]{"Slow down or stop to avoid hitting\n" +
                        "the person.",
                        "Slow down and sound your horn to hurry up\n" +
                                "the person.",
                        "Maintain your speed and swerve around the\n" +
                                "person.", "0"});

        pedestrains.add(new String[]{"You approach a crossing and see the scene in the picture. You should?", "pd022"});
        answerListForPedestrians.put("You approach a crossing and see the scene in the picture. You should?",
                new String[]{"Slow down and stop until the\n" +
                        "supervisor takes down the sign.",
                        "Slow down and drive through giving way to\n" +
                                "the children.",
                        "Stop and wait for the children until your lane\n" +
                                "is clear.", "0"});

        pedestrains.add(new String[]{"At a pedestrian crossing with traffic lights, when the lights change to red you should?", ""});
        answerListForPedestrians.put("At a pedestrian crossing with traffic lights, when the lights change to red you should?",
                new String[]{"Slow down and stop until the\n" +
                        "Stop, wait for pedestrians to cross and for the green light to come on.",
                        "Slow down and give way to pedestrians.",
                        "Stop and continue after the pedestrians have crossed.", "0"});

        pedestrains.add(new String[]{"This person is standing on a pedestrian refuge. If he steps out onto your lane you should?", "pd024"});
        answerListForPedestrians.put("This person is standing on a pedestrian refuge. If he steps out onto your lane you should?",
                new String[]{"Give way to the person if there is any\n" +
                        "danger of colliding.",
                        "Slow down and sound the horn to warn the\n" +
                                "person to move back.",
                        "Maintain your speed so you do not hold up\n" +
                                "the traffic.", "0"});

        pedestrains.add(new String[]{"Which of the following statements is correct?", "pd025"});
        answerListForPedestrians.put("Which of the following statements is correct?",
                new String[]{"You must give way to pedestrians if there\n" +
                        "is a danger of a collision.",
                        "Pedestrians must cross the road only at marked\n" +
                                "crossings and intersections.",
                        "You do not have to give way to adults crossing at\n" +
                                "children's crossings.", "0"});

        pedestrains.add(new String[]{"When you see children on or near the road?", "pd026"});
        answerListForPedestrians.put("When you see children on or near the road?",
                new String[]{"You should slow down and be more\n" +
                        "careful because they may move suddenly.",
                        "You should reduce your speed by 5 km/h.",
                        "You should ignore them and pay attention to the\n" +
                                "rear vision mirror.", "0"});

        pedestrains.add(new String[]{"When you see older people on or near the road, you should?", "pd027"});
        answerListForPedestrians.put("When you see older people on or near the road, you should?",
                new String[]{"Slow down and take extra care because\n" +
                        "they may not see you until you are very\n" +
                        "close.",
                        "Drive around them to keep the traffic moving.",
                        "Sound your horn and keep going at the same\n" +
                                "speed so you do not hold up the traffic.", "0"});

        pedestrains.add(new String[]{"You must give way to pedestrians if there is a risk of hitting them. When driving in poor light, you\n" +
                "should?", ""});
        answerListForPedestrians.put("You must give way to pedestrians if there is a risk of hitting them. When driving in poor light, you\n" +
                        "should?",
                new String[]{"Look more carefully for pedestrians because they are hard to see.",
                        "Keep your headlights on high beam all the time.",
                        "Always drive in the right hand lane so you can be away from pedestrians.", "0"});

        pedestrains.add(new String[]{"You drive up to a Light Rail vehicle that has just stopped at a tram stop. What is the most\n" +
                "important thing you should do?", "pd030"});
        answerListForPedestrians.put("You drive up to a Light Rail vehicle that has just stopped at a tram stop. What is the most\n" +
                        "important thing you should do?",
                new String[]{"Take extra care, slow down and give way to\n" +
                        "the pedestrians.",
                        "Keep a look out for traffic coming in the opposite\n" +
                                "direction.",
                        "Slow down, but keep moving so you do not delay\n" +
                                "other drivers.", "0"});

        pedestrains.add(new String[]{"You must give way to pedestrians?", "pd031"});
        answerListForPedestrians.put("You must give way to pedestrians?",
                new String[]{"At all times, if there is any danger of colliding with them, even if\n" +
                        "there is no marked crossing.",
                        "Only on marked foot crossings.",
                        "Only on marked foot crossings and traffic light pedestrian crossings.", "0"});

    }
}
