package org.littleshoot.proxy;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.handler.codec.socksx.v5.Socks5CommandRequest;

public interface UpstreamGenerator {

    Channel newChannel(final Socks5CommandRequest request);

    ChannelFuture connect(Channel channel, boolean autoRead, int connectTimeout);
}
