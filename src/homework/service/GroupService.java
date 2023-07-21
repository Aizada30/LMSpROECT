package homework.service;

import homework.model.Group;

import java.util.List;

public interface GroupService {


    List<Group>saveGroup(List<Group> groupList,String groupNewName,String groupdeskriotion);
    List<Group> getByGroupNameMet(List<Group>groupList,String groupName);
    List<Group> updateGroupName(String oldName,String newName,List<Group>groupList);
    List<Group> getAllGroupMet(List<Group>groupList);

    List<Group>addNewStudentTogroup(List<Group>groupList);


}
