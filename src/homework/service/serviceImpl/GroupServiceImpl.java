package homework.service.serviceImpl;

import homework.model.CheckInfo;
import homework.model.DateBase;
import homework.model.Group;
import homework.service.GroupService;

import java.util.InputMismatchException;
import java.util.List;

public class GroupServiceImpl implements GroupService {

    private DateBase dateBase;
    private long count;

    public GroupServiceImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public List<Group> saveGroup(List<Group> groupList, String groupNewName, String groupDeckriotion) {

        Group group = new Group();
        boolean isTrue = true;
        while (isTrue) {
            try {
                boolean foundGroup = true;
                group.setNameOfGroup(groupNewName);
                group.setDescription(groupDeckriotion);

                for (Group g : groupList) {
                    if (g.getNameOfGroup().equalsIgnoreCase(groupNewName)) {
                        isTrue = false;
                        throw new CheckInfo("Group with this name is already exited");
                    }else{
                        isTrue=true;
                    }
                }
                if (foundGroup) {
                    count++;
                    group.setId(count);
                    groupList.add(group);
                    isTrue = true;
                    System.out.println(group);
                    dateBase.getGroupList().add(group);
                    System.out.println("Group saved successfully");
                }
            } catch (CheckInfo e) {
                System.out.println(e.getMessage());
            }
        }
        return dateBase.getGroupList();

    }

    @Override
    public List<Group> getByGroupNameMet(List<Group> groupList, String groupName) {
        for (Group g : dateBase.getGroupList()) {
            if (g.getNameOfGroup().equalsIgnoreCase(groupName)) {
                System.out.println(g.toString());
            }
        }
        return null;
    }

    @Override
    public List<Group> updateGroupName(String oldName, String newName, List<Group> groupList) {
        for (Group group : dateBase.getGroupList()) {
            if (group.getNameOfGroup().equalsIgnoreCase(oldName)) {
                group.setNameOfGroup(newName);
            }
        }
        return groupList;
    }

    @Override
    public List<Group> getAllGroupMet(List<Group> groupList) {
        System.out.println(dateBase.getGroupList());
        return dateBase.getGroupList();
    }

    @Override
    public List<Group> addNewStudentTogroup(List<Group> groupList) {

        return null;
    }
}
