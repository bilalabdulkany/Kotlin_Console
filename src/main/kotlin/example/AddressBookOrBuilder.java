// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package example;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  java.util.List<Person>
      getPeopleList();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  Person getPeople(int index);
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  java.util.List<? extends PersonOrBuilder>
      getPeopleOrBuilderList();
  /**
   * <code>repeated .tutorial.Person people = 1;</code>
   */
  PersonOrBuilder getPeopleOrBuilder(
      int index);
}
