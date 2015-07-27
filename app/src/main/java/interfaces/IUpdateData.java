package interfaces;

/**
 * Created by user on 7/26/2015.
 */
import types.FriendInfo;
import types.MessageInfo;

/**
 * Created by user on 7/20/2015.
 */
public interface IUpdateData {
    public void updateData(MessageInfo[] messages, FriendInfo[] friends, FriendInfo[] unApprovedFriends, String userKey);

}
