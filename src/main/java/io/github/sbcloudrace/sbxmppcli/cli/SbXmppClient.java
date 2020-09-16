package io.github.sbcloudrace.sbxmppcli.cli;

//@Scope("singleton")
public class SbXmppClient {

    private XmppTalk xmppTalk;

    private static SbXmppClient instance;

    public static SbXmppClient getInstance() {
        if (instance == null) {
            instance = new SbXmppClient();
        }
        return instance;
    }

    private SbXmppClient() {
        Handshake xmppHandShake = new Handshake();
        xmppTalk = xmppHandShake.getXmppTalk();
    }

    public void send(String msg, Long to) {
//        XMPP_MessageType messageType = new XMPP_MessageType();
//        messageType.setToPersonaId(to);
//        messageType.setBody(msg);
//        messageType.setSubject(SubjectCalc.calculateHash(messageType.getTo().toCharArray(), msg.toCharArray()));
//        String packet = MarshalXML.marshal(messageType);
//        xmppTalk.write(packet);
    }

//    public void send(Object object, Long to) {
//        String responseXmlStr = MarshalXML.marshal(object);
//        this.send(responseXmlStr, to);
//    }

    public void disconnect() {
        instance = null;
    }
}