package br.com.gndi.liferay.service.messaging;

import br.com.gndi.liferay.service.ClpSerializer;
import br.com.gndi.liferay.service.ContratoLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            ContratoLocalServiceUtil.clearService();
        }
    }
}
