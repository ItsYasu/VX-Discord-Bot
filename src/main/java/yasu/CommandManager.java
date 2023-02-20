package yasu;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class CommandManager extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String botuserid = "1077014809943486464";
        if (!event.getAuthor().getId().equals(botuserid)) {
            if (event.getMessage().getContentRaw().contains("https://twitter") || event.getMessage().getContentRaw().contains("http://twitter")) {
                String message = event.getMessage().getContentRaw();
                String modifiedmessage = UrlModifier.extractURL(message);
                event.getChannel().sendMessage(modifiedmessage).queue();

            }

        }
    }
}
