/**
 * EQDiet Beta 0.8 DataBase (ver 05/23/2020).
 * (C) 2020, EQDiet and Daniel Lopez Tena.
 * Website: https://eqdiet.weebly.com
 * This program comes with NO WARANTY. It's safe but use it at your own risk.
 * Project protected by the MIT license.
 * See our GitHub repositories for more information at https://github.com/EQDiet
 * 
 * How it works:
 * 1. EQDietBeta08.java (the main class) creates the food and quantity variables.
 * 2. Later, it invokes this file (database.java).
 * 3. Searches the selected food in this file in foodonly variable.
 * 4. It remembers the position of the food and looks for the kilocalories at the same position in kcalonly variable.
 * 5. It gives the kilocalories result, so the main class can calculate it.
 * 6. Finally, the calculated kilocalories result shows in the screen and saves in the log.
 * 
 * Thanks to https://www.foodspring.es/tabla-calorica (website in spanish) for all the kilocalories!
 * And thanks a lot to Mª Dolores P. C. for giving me lots of food kilocalories!
 */

public class database {
    static String[] foodonly ={ //Ten per line. Duplicate foods do not count
        "apple", "pineapple", "apricot", "pear", "banana", "blueberry", "blood orange", "blackberry", "red cranberry", "strawberry",
        "fig", "grapefruit", "pomegranate", "hip", "rosehip", "melon", "raspberry", "ginger", "kiwi", "cherry", "lychee", "litchi",
        "tangerine", "mango", "passion fruit", "plum", "peach", "quince", "rhubarb", "watermelon", "grape", "lemon",
        "eggplant", "artichoke", "avocado", "cauliflower", "broccoli", "bean", "watercress", "mushroom", "chinese cabbage", "chilli",
        "pea", "iceberg lettuce", "fennel", "cucumber", "kale", "carrot", "potato", "swede", "kohlrabi", "pumpkin", "leek",
        "corn", "chard", "pepper", "radish", "beet", "beetroot", "red cabbage", "brussel sprouts", "rocket", "asparagaus", "spinach",
        "sweet potato", "zucchini", "onion", "sausage", "hot dog", "duck", "deer", "chicken breast", "veal", "lamb", "turkey breast",
        "salami", "ham", "bacon", "beef", "minced beef", "pork", "pork schnitzel", "trout", "pike", "herring",
        "salmon", "perch", "pout", "tuna", "buttermilk", "fresh cream", "cheddar", "cheddar cheese", "emmental cheese", "emmental", "edam cheese", "edam", "egg",
        "cottage cheese", "coconut milk", "milk", "skimmed quark cheese", "natural yoghurt", "plain yoghurt", "cream", "sour cream", "noodles", "spelled pasta", "farfalle",
        "glass noodles", "whole wheat spaghetti", "bread", "wholemeal bread", "bretzel", "croissant", "cinnamon roll", "cheeseburger", "chips", "curried sausage", 
        "kebab", "chocolate cookies", "vegetarian kebab", "margarita pizza", "salami pizza", "french fries", "burger", "nutella", "chocolate"
    };
    static int[] kcalonly ={ //Ten per line. Duplicate foods do not count
        52, 55, 43, 55, 88, 35, 45, 43, 46, 32,
        107, 50, 74, 162, 162, 54, 36, 80, 51, 50, 66, 66,
        50, 62, 97, 47, 41, 38, 21, 30, 70, 35,
        24, 47, 160, 25, 35, 25, 19, 22, 13, 40,
        82, 14, 31, 15, 49, 36, 86, 27, 27, 19, 31,
        108, 19, 21, 16, 43, 43, 29, 43, 25, 18, 23,
        76, 20, 40, 375, 375, 375, 375, 75, 94, 178, 111,
        507, 335, 645, 115, 212, 171, 105, 50, 50, 146,
        137, 111, 83, 144, 38, 292, 403, 403, 382, 382, 251, 251, 155,
        104, 136, 47, 67, 62, 62, 204, 162, 142, 128, 147,
        124, 152, 265, 293, 217, 393, 384, 250, 539, 288,
        215, 512, 107, 199, 245, 291, 291, 547, 546
    };
}