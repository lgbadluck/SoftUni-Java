package FinalsExam_31_03_24;

import java.util.*;

public class MessageManager_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityMsgCount = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        HashMap<String, MsgStats> usernameMsgSentReceivedMap = new LinkedHashMap<>();

        while (!input.equals("Statistics")) {
            String[] commandParts = input.split("=");
            if (commandParts[0].equals("Add")) {
                String usernameToAdd = commandParts[1];
                int sentMsgCount = Integer.parseInt(commandParts[2]);
                int receivedMsgCount = Integer.parseInt(commandParts[3]);
                usernameMsgSentReceivedMap.putIfAbsent(usernameToAdd, new MsgStats(sentMsgCount, receivedMsgCount));
            } else if (commandParts[0].equals("Message")) {
                String senderUserName = commandParts[1];
                String receiverUserName = commandParts[2];
                if (usernameMsgSentReceivedMap.containsKey(senderUserName) && usernameMsgSentReceivedMap.containsKey(receiverUserName)) {
                    MsgStats senderStats = usernameMsgSentReceivedMap.get(senderUserName);
                    int sent = usernameMsgSentReceivedMap.get(senderUserName).getSent();
                    if (senderStats.getSent() + senderStats.getReceived() + 1 >= capacityMsgCount) {
                        System.out.println(senderUserName + " reached the capacity!");
                        usernameMsgSentReceivedMap.remove(senderUserName);
                    } else {
                        senderStats.Sent = sent + 1;
                        usernameMsgSentReceivedMap.put(senderUserName, senderStats);
                    }
                    MsgStats receiverStats = usernameMsgSentReceivedMap.get(receiverUserName);
                    int received = usernameMsgSentReceivedMap.get(receiverUserName).getReceived();
                    if (receiverStats.getSent() + receiverStats.getReceived() + 1 >= capacityMsgCount) {
                        System.out.println(receiverUserName + " reached the capacity!");
                        usernameMsgSentReceivedMap.remove(receiverUserName);
                    } else {
                        receiverStats.Received = received + 1;
                        usernameMsgSentReceivedMap.put(receiverUserName, receiverStats);
                    }
                }

            } else if (commandParts[0].equals("Empty")) {
                String usernameToEmpty = commandParts[1];
                if (usernameToEmpty.equals("All")) {
                    usernameMsgSentReceivedMap.clear();
                } else {
                    usernameMsgSentReceivedMap.remove(usernameToEmpty);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Users count: " + usernameMsgSentReceivedMap.size());
        for (Map.Entry<String, MsgStats> stringMsgStatsEntry : usernameMsgSentReceivedMap.entrySet()) {
            System.out.printf("%s - %d\n", stringMsgStatsEntry.getKey(), (stringMsgStatsEntry.getValue().getSent() + stringMsgStatsEntry.getValue().getReceived()));
        }

    }

    public static class MsgStats {
        int Sent;
        int Received;

        public MsgStats(int sent, int received) {
            Sent = sent;
            Received = received;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MsgStats msgStats = (MsgStats) o;
            return getSent() == msgStats.getSent() && getReceived() == msgStats.getReceived();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getSent(), getReceived());
        }

        public int getSent() {
            return Sent;
        }

        public void setSent(int sent) {
            Sent = sent;
        }

        public int getReceived() {
            return Received;
        }

        public void setReceived(int received) {
            Received = received;
        }
    }
}
