package fr.ringularity.infinitePower.tools.JsonRegister;

import fr.ringularity.infinitePower.References;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JsonRegister {
    private static ArrayList<String> itemsNameId = new ArrayList<String>();
    private static ArrayList<String> itemsName = new ArrayList<String>();

    private static ArrayList<String> blocksNameId = new ArrayList<String>();
    private static ArrayList<String> blocksName = new ArrayList<String>();

    private static String path = "E:\\Prog\\Java\\Modding\\forge-1.15.2-31.1.0\\src\\main\\resources\\assets\\electricallife\\";

    public static void addItem(String nameId, String name) {
        itemsNameId.add(nameId);
        itemsName.add(name);
    }

    public static void addBlock(String nameId, String name) {
        blocksNameId.add(nameId);
        blocksName.add(name);
    }


    public static void createJsonFiles() {

        ///////////// ITEMS /////////////

        for (int i = 0; i < itemsNameId.size(); ++i) {
            try {
                FileWriter itemFile = new FileWriter(path + "models\\item\\" + itemsNameId.get(i) + ".json");
                itemFile.write("{\n" +
                        "  \"parent\": \"item/generated\",\n" +
                        "  \"textures\": {\n" +
                        "    \"layer0\": \"" + References.MOD_ID + ":items/" + itemsNameId.get(i) + "\"\n" +
                        "  }\n" +
                        "}");
                itemFile.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        ///////////// BLOCKS /////////////

        for (int i = 0; i < blocksNameId.size(); ++i) {
            try {
                FileWriter blockStateFile = new FileWriter(path + "blockstates\\" + blocksNameId.get(i) + ".json");
                FileWriter blockModelFile = new FileWriter(path + "models\\block\\" + blocksNameId.get(i) + ".json");
                FileWriter itemForBlockModelFile = new FileWriter(path + "models\\item\\" + blocksNameId.get(i) + ".json");

                blockStateFile.write("{\n" +
                        "    \"variants\": {\n" +
                        "        \"\": { \"model\": \"" + References.MOD_ID + ":block/" + blocksNameId.get(i) + "\" }\n" +
                        "    }\n" +
                        "}");
                blockStateFile.close();

                blockModelFile.write("{\n" +
                        "    \"parent\": \"block/cube_all\",\n" +
                        "    \"textures\": {\n" +
                        "        \"all\":\"" + References.MOD_ID + ":blocks/" + blocksNameId.get(i) + "\"\n" +
                        "    }\n" +
                        "}");
                blockModelFile.close();

                itemForBlockModelFile.write("{\n" +
                        "    \"parent\": \"" + References.MOD_ID + ":block/" + blocksNameId.get(i) + "\"\n" +
                        "}");
                itemForBlockModelFile.close();


            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        ///////////// LANG /////////////

        String langFileContent = "{\n";
        for (int i = 0; i < itemsNameId.size(); ++i) {
            langFileContent += "\t\"item." + References.MOD_ID + "." + itemsNameId.get(i) + "\": \"" + itemsName.get(i) + "\",\n";
        }
        for (int i = 0; i < blocksNameId.size(); ++i) {
            langFileContent += "\t\"block." + References.MOD_ID + "." + blocksNameId.get(i) + "\": \"" + blocksName.get(i) + "\",\n";
        }
        langFileContent = langFileContent.substring(0, langFileContent.length() - 2);
        langFileContent += "\n}";

        try {
            FileWriter langFile = new FileWriter(path + "lang\\en_us.json");
            langFile.write(langFileContent);
            langFile.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
