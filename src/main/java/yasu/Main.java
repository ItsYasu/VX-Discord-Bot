package yasu;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {

    public static void main(String args[]) throws InterruptedException {
        try {
            // Creating the bot (default config)x
            JDA bot = JDABuilder.createDefault(Config.getDiscordApiToken()) //Change the config if you aren't opening file from .jar
                    .setActivity(Activity.listening("Havers Only"))
                    .setStatus(OnlineStatus.ONLINE)
                    .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_WEBHOOKS, GatewayIntent.MESSAGE_CONTENT)
                    .addEventListeners(new CommandManager())
                    .build().awaitReady(); // await.Ready() is really important for guild commands


        } catch (Exception e) {
            System.out.println("Wrong discord token");
        }

    }
}
