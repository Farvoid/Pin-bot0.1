import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendAnimation;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



public class Bot extends TelegramLongPollingBot {



    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(Message message, String text) {



        SendMessage sendMessage = new SendMessage();

        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());

        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }





    public void sendPhot(Message message) {


        SendPhoto msg = new SendPhoto();
        msg.setChatId(message.getChatId().toString());
        msg.setCaption("Візьміть на роботу ");
        msg.setPhoto("https://ibb.co/bmJKCx4");

        try {

            execute(msg);
        } catch (
                TelegramApiException e) {
            e.printStackTrace();
        }
    }

        public void sendAudio(Message message) {

            SendAudio audio = new SendAudio();
            audio.setChatId(message.getChatId().toString());
            audio.setAudio("https://cs1.mp3fm.top/listen/121070580/TkVtN0U2V0RQa0wvYkliT0pXMDc0WEcrMytEZ055Y2trTzF1TXhJV29qY2xDd2xBaFNhRndwa3hmWmtKdFlsRU9ndm9iNURZd2xJT1dsaE1WN0hrVUcvUU0rNnNyTG5CcEJpOHhjc05lNkwxeGFSb0dZaE9PYzRaM09KSDNCY24/Evil_Arthas_Gimn_Papicha_(mp3fm.top).mp3");


        try{
        execute(audio);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }


    }


    public void sendAnimation(Message message) {
        SendAnimation animation = new SendAnimation();
        animation.setChatId(message.getChatId().toString());
        animation.setAnimation("https://media1.tenor.com/images/6e7e3a0bd84732bc507b2345fb79ab62/tenor.gif?itemid=5359813");

        try {
            execute(animation);
        } catch (
                TelegramApiException e) {
            e.printStackTrace();
        }
    }



    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();


        if (message != null && message.hasText()) switch (message.getText()) {


            case "/pinP":
                sendMsg(message, "@svyatoiya  @sosalochkaa @UkrainianSlavianin  @IbRis96 @Vantlord " +
                        "@narzc @elikzdesi @cartieronmywrist\n" +
                        "ЗАПРОШУЮ ДО ГРИ");
                break;
            case "/shara":
                sendMsg(message, "@IngridKharber @slavboi @zayanna007 ");

            case "/all":


                sendMsg(message, " @LostDenis @Vadykman @d1nozavr1k @nichegolichnogodrug @azdarova @denrin @ArtiSH0CK23 " +
                        "@barychkina @DeTaker @ArtiSH0CK23 @sosixyuuu @gvalerii @Miroslaav" +
                        "   @myviktory   @WindXP  @ninafilimonova @VeRsKinG @d1nozavr1k @nichegolichnogodrug  " +
                        "@Cirozzz  @dasshh ");
                break;
            case "/home":
                sendMsg(message, "Do");
                break;
            case "/win":
                sendAudio(message);
                break;


            case "/p":
                sendMsg(message, "user");
                break;
            case "/photo":
                sendPhot(message);
                break;
            case "/good_night":
                sendAnimation(message);
            break;


            default:


        }
    }

      /* List<User> newUsers = update.getMessage().getNewChatMembers();
        if (newUsers != null )
        {

            for (User newUser : newUsers ) {

                    String user = newUser.getUserName().equals("null") ? newUser.getFirstName()
                            : "@" + newUser.getUserName();
                    String a = user;
                    sendMsg(message, a);

            }

        }
        another function */






    public String getBotUsername() {
        return "Железяка";
    }

    public String getBotToken() {
        return "801287052:AAGJwLeT2WAQsta8BQOnvOBMLYCDyR0fm0Y";
    }
}
