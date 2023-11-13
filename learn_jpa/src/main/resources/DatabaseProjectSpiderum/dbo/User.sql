CREATE TABLE [dbo].[User] (
    [id]          INT            IDENTITY (1, 1) NOT NULL,
    [name]        VARCHAR (255)  NULL,
    [phoneNumber] VARCHAR (20)   NULL,
    [role]        INT            NULL,
    [password]    VARCHAR (255)  NULL,
    [emailUser]   NVARCHAR (255) NULL,
    PRIMARY KEY CLUSTERED ([id] ASC),
    FOREIGN KEY ([role]) REFERENCES [dbo].[Role] ([roleid])
);


GO

