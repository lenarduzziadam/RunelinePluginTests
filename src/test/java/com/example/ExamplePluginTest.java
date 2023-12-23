package com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import java.util.logging.Logger;

public class ExamplePluginTest
{
    private static final Logger logger = Logger.getLogger(ExamplePluginTest.class.getName());

    public static void main(String[] args)
    {
        try {
            // Load the ExamplePlugin
            ExternalPluginManager.loadBuiltin(ExamplePlugin.class);
            logger.info("ExamplePlugin loaded successfully.");

            // Process custom arguments //figure out how to actually program this
            processArguments(args);

            // Start RuneLite
            RuneLite.main(args);
        } catch (Exception e) {
            logger.severe("An error occurred while starting the ExamplePlugin: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processArguments(String[] args) {
        // Process any custom arguments for your plugin here
        // For example, configuration settings, debug modes, etc.
        for (String arg : args) {
            logger.info("Processing argument: " + arg);
            // Add your argument processing logic here
        }
    }
}
