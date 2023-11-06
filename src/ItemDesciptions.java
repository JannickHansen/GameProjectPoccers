public class ItemDesciptions {
    String foundDescription;

    ItemDesciptions() {

    }

    public void findItemDescription(String chosenItem) {
        foundDescription = switch (chosenItem) {
            case "Pokeball" -> "A ball used to catch pokemon.. Kind of implied in the name";
            case "Greatball" -> "The Pokeballs great cousin.. 1.5x better at catching stuff!";
            case "Ultraball" -> "The only real ball to catch pokemon.. better design, cool name and 2x catch modifier!";
            case "Potion" -> "A type of medicine that restores 20hp.";
            case "Super Potion" -> "A type of medicine that restores 50hp.";
            case "Hyper Potion" -> "Highly advanced medicine that restores 200hp";
            case "Rare Candy" -> "Candy that is so hard to come by that you'll save it for a better time.. only to reach level 100 without using it.";
            default -> "Please make a valid choice.";

        };
        System.out.println(foundDescription+"\n");
    }
}
