package service.impl;

import model.Group;
import service.GroupAble;
import service.StudentAble;

import java.util.List;

public class GroupImpl implements GroupAble {
    @Override
    public String addNewGroup(Group group) {
        return null;
    }

    @Override
    public String getGroupById(int id) {
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
