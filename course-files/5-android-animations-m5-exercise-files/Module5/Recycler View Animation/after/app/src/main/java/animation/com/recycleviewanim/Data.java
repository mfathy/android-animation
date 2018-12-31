package animation.com.recycleviewanim;

import java.util.ArrayList;

public class Data {


    public ArrayList<Information> getData() {

        ArrayList<Information> data = new ArrayList<>();

        int[] images = {

                R.drawable.dolphin01,
                R.drawable.dolphin02,
                R.drawable.dolphin03,
                R.drawable.dolphin04,

                R.drawable.penguin01,
                R.drawable.penguin02,
                R.drawable.penguin03,
                R.drawable.penguin04,
                R.drawable.penguin05,
                R.drawable.penguin06,

                R.drawable.rabbit01,
                R.drawable.rabbit02,
                R.drawable.rabbit03,
                R.drawable.rabbit04,

                R.drawable.ani_cat_one,
                R.drawable.ani_cat_two,
                R.drawable.ani_cat_three,
                R.drawable.ani_cat_four,
                R.drawable.ani_cat_five,
                R.drawable.ani_cat_six,
                R.drawable.ani_cat_seven,

                R.drawable.ani_dog_one,
                R.drawable.ani_dog_two,
                R.drawable.ani_dog_three,
                R.drawable.ani_dog_four,
                R.drawable.ani_dog_five,

                R.drawable.ani_deer_one,
                R.drawable.ani_deer_two,
                R.drawable.ani_deer_three,
                R.drawable.ani_deer_four,

                R.drawable.bird_parrot_one,
                R.drawable.bird_parrot_two,
                R.drawable.bird_parrot_three,
                R.drawable.bird_parrot_four,
                R.drawable.bird_parrot_five,
                R.drawable.bird_parrot_six,
                R.drawable.bird_parrot_seven,
                R.drawable.bird_parrot_eight
        };

        String[] Categories = {"Dolphin 1", "Dolphin 2", "Dolphin 3", "Dolphin 4",
                                "Penguin 1","Penguin 2", "Penguin 3", "Penguin 4", "Penguin 5", "Penguin 6",
                                "Rabbit 1", "Rabbit 2",  "Rabbit 3",  "Rabbit 4",
                                "Cat 1",    "Cat 2",     "Cat 3",     "Cat 4" ,    "Cat 5" ,    "Cat 6",    "Cat 7",
                                "Dog 1",    "Dog 2",     "Dog 3",     "Dog 4",     "Dog 5",
                                "Deer 1",   "Deer 2",    "Deer 3",    "Deer 4",
                                "Parrot 1", "Parrot 2", "Parrot 3",   "Parrot 4",  "Parrot 5",  "Parrot 6", "Parrot 7", "Parrot 8"};

        for (int i = 0; i < images.length; i++) {

            Information current = new Information();
            current.title = Categories[i];
            current.ItemId = images[i];

            data.add(current);
        }

        return data;
    }


    public class Information{

        public int ItemId;
        public String title;
    }

}
