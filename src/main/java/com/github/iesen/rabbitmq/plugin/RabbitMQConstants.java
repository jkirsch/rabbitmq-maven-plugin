package com.github.iesen.rabbitmq.plugin;

import org.apache.commons.lang3.SystemUtils;

import java.io.File;

/**
 */
public class RabbitMQConstants {

    public static final String RABBITMQ_DEFAULT_PORT = "5672";
    public static final String RABBITMQ_VERSION = "3.6.6";
    public static final String RABBITMQ_PARENT_DIR = SystemUtils.getUserHome() + File.separator + ".rabbitmq_maven_plugin";
    public static final String RABBITMQ_HOME = RABBITMQ_PARENT_DIR + File.separator + "rabbitmq_server-" + RABBITMQ_VERSION;
    public static final String ERLANG_HOME_WIN = System.getenv("ProgramFiles") + File.separator + "erl8.2";
    public static final String ERLANG_INSTALLER_URL = "http://erlang.org/download/otp_win64_19.2.exe";
    public static final String ERLANG_INSTALLER_FILE_NAME = "otp_win64_19.2.exe";


    private RabbitMQConstants() {

    }

}
