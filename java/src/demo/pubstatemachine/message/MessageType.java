package demo.pubstatemachine.message;

public enum  MessageType {
    COMMAND_GRAPHIC_EDIT,
    COMMAND_COPY_EDIT,
    COMMAND_PUBLISH,
    EVENT_PUBLISHED,
    COMMAND_AWAIT_EDIT,
    COMMAND_AWAIT_PUBLISH,
    EVENT_EDITABLE,
    EVENT_GRAPHIC_EDITABLE,
    EVENT_COPY_EDITABLE,
    EVENT_PUBLISHABLE,
    EVENT_AWAIT_COPY_EDIT,
    EVENT_AWAIT_GRAPHIC_EDIT,
    EVENT_AWAIT_PUBLISH;
}
